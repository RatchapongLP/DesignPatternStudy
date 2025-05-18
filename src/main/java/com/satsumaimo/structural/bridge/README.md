# Bridge design pattern

Suppose there is a class hierarchy that consists of layer(s) that is tightly coupled to another one 
(refer to `com.satsumaimo.structural.bridge.awkwarddesign.model`), as shown:

```
                             ------------------------Shape-------------------------
                            /                                                      \
                      Square                                                       Triangle
                     /      \                                                      /      \
MediumDashedLineSquare      ThickContinuousLineSquare       MediumDashedLineTriangle      ThickContinuousLineTriangle
```
As you can see, the subclasses of `Square` and `Triangle` need to cover all the variation of existing line types.
If a `ThinDashedLine` variation is to be added to the system or
`MediumDashedLineSquare` is to be removed, `Square` and `Triangle` need adjustments on their subclasses accordingly.

The solution is to refactor the architecture with Bridge pattern,
composing orthogonal (dissociated, decoupled) hierarchies.
In this case, two orthogonal hierarchies are formed (refer to `com.satsumaimo.structural.bridge.cleandesign.model`):

```
          ----Shape----                                        Outline
         /             \                                      /       \
Square(Outline)    Triangle(Outline)           MediumDashedLine       ThickContinuousLine
```
Consequently, rather than creating various subclasses of each `Shape` to accommodate multiple types of line,
we make those `Shape`'s communicate to `Outline` interface type.
> ***This promotes composition rather than inheritance.***

### Definitions

*Abstraction* = Shape  
*Refined Abstractions* = Square, Triangle  
*Implementor* = Outline     
*Concrete Implementors* = MediumDashedLine, ThickContinuousLine 


The benefit of the Bridge pattern is even more obvious when more concrete implementors are added to the system.

As demonstrated in `com.satsumaimo.structural.bridge.cleandesign.model.outline` package, 
when the number of Outline 
implementations is increased to nine,
no refactors is required in `com.satsumaimo.structural.bridge.cleandesign.model.shape` package.

Whereas the poorly designed classes in `com.satsumaimo.structural.bridge.awkwarddesign.model.shape` have 
to multiply up to `no. of Shape implementations x no. of Outline implementations`, which is `2 x 9`.



