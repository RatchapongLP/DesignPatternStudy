# Bridge design pattern

When orthogonal hierarchies are entangled:
```
                             ------------------------Shape-------------------------
                            /                                                      \
                      Square                                                       Triangle
                     /      \                                                      /      \
MediumDashedLineSquare      ThickContinuousLineSquare       MediumDashedLineTriangle      ThickContinuousLineTriangle
```
Refactor to Bridge pattern:
```

          ----Shape---                                      Outline
         /            \                                      /   \
Square(Outline)   Triangle(Outline)           MediumDashedLine   ThickContinuousLine
```
Shape = Abstraction  
Square = RefinedAbstraction  
Outline = Implementor  
MediumDashedLine = ConcreteImplementor

***This promotes composition rather than inheritance.***

