---
title: Class MutationObserver
second_title: Referencia de API de Aspose.SVG para .NET
description: Aspose.Svg.Dom.Mutations.MutationObserver clase. AMutationObserver El objeto se puede utilizar para observar mutaciones en el árbol deNode .
type: docs
weight: 1120
url: /es/net/aspose.svg.dom.mutations/mutationobserver/
---
## MutationObserver class

A`MutationObserver` El objeto se puede utilizar para observar mutaciones en el árbol de[`Node`](../../aspose.svg.dom/node/) .

```csharp
public class MutationObserver : DOMObject
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [MutationObserver](mutationobserver/)(MutationCallback) | Construye un objeto MutationObserver y establece su[`MutationCallback`](../mutationcallback/) llamar de vuelta. La devolución de llamada se invoca con una lista de objetos MutationRecord como primer argumento y el objeto MutationObserver construido como segundo argumento. Se invoca después de que los nodos registrados con el!:Observe(Node, IMutationObserverInit) método, están mutados. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Disconnect](../../aspose.svg.dom.mutations/mutationobserver/disconnect/)() | Evita que el observador observe cualquier mutación. Hasta que se vuelva a utilizar el método observe(), no se invocará la devolución de llamada del observador. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Este método se utiliza para recuperar el objeto ECMAScriptType . |
| [Observe](../../aspose.svg.dom.mutations/mutationobserver/observe/#observe)(Node) | Indica al agente de usuario que observe un objetivo dado (un nodo) e informe cualquier mutación según los criterios proporcionados por las opciones (un objeto). El argumento de opciones permite establecer opciones de observación de mutaciones a través de miembros del objeto. |
| [Observe](../../aspose.svg.dom.mutations/mutationobserver/observe/#observe_1)(Node, MutationObserverInit) | Indica al agente de usuario que observe un objetivo dado (un nodo) e informe cualquier mutación según los criterios proporcionados por las opciones (un objeto). El argumento de opciones permite establecer opciones de observación de mutaciones a través de miembros del objeto. |
| [TakeRecords](../../aspose.svg.dom.mutations/mutationobserver/takerecords/)() | El método devuelve una copia de la cola de registros y luego vacía la cola de registros. |

### Ver también

* class [DOMObject](../../aspose.svg.dom/domobject/)
* espacio de nombres [Aspose.Svg.Dom.Mutations](../../aspose.svg.dom.mutations/)
* asamblea [Aspose.SVG](../../)


