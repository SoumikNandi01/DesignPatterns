1. Make sure your business domain can be represented as a primary component with multiple optional layers over it. 
2. Figure out what methods are common to both the primary component and the optional layers. Create a component interface and declare those methods there.

3. Create a concrete component class and define the base behavior in it.

4. Create a base decorator class. It should have a field for storing a reference to a wrapped object. The field should be declared with the component interface type to allow linking to concrete components as well as decorators. The base decorator must delegate all work to the wrapped object. 
5. Make sure all classes implement the component interface.

6. Create concrete decorators by extending them from the base decorator. A concrete decorator must execute its behavior before or after the call to the parent method (which always delegates to the wrapped object).

7. The client code must be responsible for creating decorators and composing them in the way the client needs.


Exemplary Use Case : Suppose you have a beverage stall and you sell tea, coffee and milk. Now customers can customise their orders
by adding extra add ons (Caramel, Chocolate, Whipped Cream etc). Now there can be so many combinations for example. Coffee with Whipped Cream and Chocolate. 
Now to represent these combinations, we cannot create so many classes. Rather we have a decorator pattern (look into the video)

Industry Use Case? While deprecating a function or an API, you might want to wrap your old API by a new API wrapper. The request will then be queried to the new API and will internally flow to the old API. This way you don't have to deprecate the API at multiple places