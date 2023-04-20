---
title: Class ErrorEvent
second_title: Referencia de API de Aspose.SVG para .NET
description: Aspose.Svg.Dom.Events.ErrorEvent clase. ElErrorEvent proporciona información contextual sobre errores que ocurrieron durante el tiempo de ejecución.
type: docs
weight: 910
url: /es/net/aspose.svg.dom.events/errorevent/
---
## ErrorEvent class

El`ErrorEvent` proporciona información contextual sobre errores que ocurrieron durante el tiempo de ejecución.

```csharp
public class ErrorEvent : Event
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [ErrorEvent](errorevent/#constructor_1)(Exception) | Inicializa una nueva instancia del`ErrorEvent` clase. |
| [ErrorEvent](errorevent/#constructor)(IDictionary&lt;string, object&gt;) | Inicializa una nueva instancia del`ErrorEvent` clase. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles/) { get; } | Se utiliza para indicar si un evento es un evento burbujeante o no. Si el evento puede burbujear, el valor es verdadero; de lo contrario, el valor es falso. |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable/) { get; } | Se utiliza para indicar si un evento puede o no tener su acción predeterminada prevenida. Si se puede evitar la acción predeterminada, el valor es verdadero; de lo contrario, el valor es falso. |
| [ColNo](../../aspose.svg.dom.events/errorevent/colno/) { get; } | El atributo colno debe devolver el valor con el que se inicializó. Cuando se crea el objeto, este atributo debe inicializarse a cero. Representa el número de columna donde ocurrió el error en el script. |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget/) { get; } | Se utiliza para indicar el[`IEventTarget`](../ieventtarget/) cuyo[`IEventListener`](../ieventlistener/) los mensajes de correo electrónico se están procesando actualmente. Esto es especialmente útil durante la captura y el burbujeo. |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented/) { get; } | Devuelve verdadero si se invocó preventDefault() mientras el valor del atributo cancelable es verdadero y falso en caso contrario. |
| [Error](../../aspose.svg.dom.events/errorevent/error/) { get; } | El atributo de error debe devolver el valor con el que se inicializó. Cuando se crea el objeto, este atributo debe inicializarse como nulo. En su caso, se establece en el objeto que representa el error (por ejemplo, el objeto de excepción en el caso de una excepción DOM no detectada). |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase/) { get; } | Se utiliza para indicar qué fase del flujo de eventos se está evaluando actualmente. |
| [FileName](../../aspose.svg.dom.events/errorevent/filename/) { get; } | El atributo de nombre de archivo debe devolver el valor con el que se inicializó. Cuando se crea el objeto, este atributo debe inicializarse en la cadena vacía. Representa la URL absoluta del script en el que se produjo originalmente el error. |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted/) { get; } | El atributo isTrusted debe devolver el valor con el que se inicializó. Cuando se crea un evento, el atributo debe inicializarse en false. |
| [LineNo](../../aspose.svg.dom.events/errorevent/lineno/) { get; } | El atributo lineno debe devolver el valor con el que se inicializó. Cuando se crea el objeto, este atributo debe inicializarse a cero. Representa el número de línea donde ocurrió el error en el script. |
| [Message](../../aspose.svg.dom.events/errorevent/message/) { get; } | El atributo del mensaje debe devolver el valor con el que se inicializó. Cuando se crea el objeto, este atributo debe inicializarse en la cadena vacía. Representa el mensaje de error. |
| [Target](../../aspose.svg.dom.events/event/target/) { get; } | Se utiliza para indicar el[`IEventTarget`](../ieventtarget/) al que se despachó originalmente el evento. |
| [TimeStamp](../../aspose.svg.dom.events/event/timestamp/) { get; } | Se utiliza para especificar la hora (en milisegundos con respecto a la época) en la que se creó el evento. Debido al hecho de que algunos sistemas pueden no proporcionar esta información, es posible que el valor de timeStamp no esté disponible para todos los eventos. Cuando no está disponible , se devolverá un valor de 0. Ejemplos de tiempo de época son el tiempo de inicio del sistema o 0:0:0 UTC del 1 de enero de 1970. |
| [Type](../../aspose.svg.dom.events/event/type/) { get; } | El nombre del evento (no distingue entre mayúsculas y minúsculas). El nombre debe ser un nombre XML. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Este método se utiliza para recuperar el objeto ECMAScriptType . |
| [InitEvent](../../aspose.svg.dom.events/event/initevent/)(string, bool, bool) | El[`InitEvent`](../event/initevent/) El método se utiliza para inicializar el valor de un[`Event`](../event/) creado a través de the [`IDocumentEvent`](../idocumentevent/) interfaz. |
| [PreventDefault](../../aspose.svg.dom.events/event/preventdefault/)() | Si un evento es cancelable, el[`PreventDefault`](../event/preventdefault/) El método se utiliza para indicar que el evento debe cancelarse, lo que significa que no se producirá ninguna acción predeterminada que normalmente toma la implementación como resultado del evento. |
| [StopImmediatePropagation](../../aspose.svg.dom.events/event/stopimmediatepropagation/)() | La invocación de este método evita que el evento llegue a cualquier detector de eventos registrado después del actual y, cuando se distribuye en un árbol, también evita que el evento llegue a cualquier otro objeto. |
| [StopPropagation](../../aspose.svg.dom.events/event/stoppropagation/)() | El[`StopPropagation`](../event/stoppropagation/) El método se utiliza para evitar la propagación adicional de un evento durante el flujo del evento. |

### Ver también

* class [Event](../event/)
* espacio de nombres [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events/)
* asamblea [Aspose.SVG](../../)


