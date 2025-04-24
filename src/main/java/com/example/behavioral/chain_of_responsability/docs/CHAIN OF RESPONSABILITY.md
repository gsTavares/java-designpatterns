# Chain of Responsability

A way to decouple processing handle logic delegating it to multiple objects

Each handler have a reference to the next handler, util the chain finishes

## UML Example

![alt text](chain_of_responsability_uml_example.png)

## Implementation considerations

- Define handler as interface
- Servlet filters follows this pattern