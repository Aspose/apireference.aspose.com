---
title: Interface IWindow
second_title: Referencia de API de Aspose.SVG para .NET
description: Aspose.Svg.Window.IWindow interfaz. El objeto ventana representa una ventana que contiene un documento DOM.
type: docs
weight: 3820
url: /es/net/aspose.svg.window/iwindow/
---
## IWindow interface

El objeto ventana representa una ventana que contiene un documento DOM.

```csharp
public interface IWindow : IDisposable, IDocumentView, IEventTarget, IGlobalEventHandlers, 
    IWindowEventHandlers, IWindowTimers
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Document](../../aspose.svg.window/iwindow/document/) { get; } | El atributo del documento debe devolver el objeto Documento más reciente del objeto Ventana. |
| [FrameElement](../../aspose.svg.window/iwindow/frameelement/) { get; } | El objeto frameElement de un Documento. |
| [Location](../../aspose.svg.window/iwindow/location/) { get; } | El atributo de ubicación de la interfaz de la ventana debe devolver el objeto de ubicación para el documento de ese objeto de ventana. |
| [Name](../../aspose.svg.window/iwindow/name/) { get; set; } | El atributo de nombre del objeto Ventana debe, al obtenerse, devolver el nombre actual del contexto de exploración y, al establecerse, establecer el nombre del contexto de exploración en el nuevo valor. |
| [Opener](../../aspose.svg.window/iwindow/opener/) { get; } | El atributo IDL de apertura en el objeto Ventana, al obtenerlo, debe devolver el objeto WindowProxy del contexto de exploración a partir del cual se creó el contexto de exploración actual (su contexto de exploración de apertura), si lo hay, si todavía está disponible y si el contexto de navegación actual no ha repudiado a su abridor; de lo contrario, debe devolver nulo. En la configuración, si el nuevo valor es nulo, el contexto de navegación actual debe rechazar su abridor; si el nuevo valor es cualquier otra cosa, entonces el agente de usuario debe llamar al método interno [[DefineOwnProperty]] del objeto Ventana, pasando el nombre de propiedad "abridor" como clave de propiedad, y el Descriptor de propiedad { [[Valor]]: valor , [[Writable]]: true, [[Enumerable]]: true, [[Configurable]]: true } como descriptor de propiedad, donde value es el nuevo valor. |
| [Parent](../../aspose.svg.window/iwindow/parent/) { get; } | El atributo IDL principal en el objeto Ventana de un Documento en un contexto de navegación b debe devolver el objeto WindowProxy del contexto de navegación principal, si lo hay (es decir, si b es un contexto de navegación secundario), o el objeto WindowProxy del contexto de navegación contexto b en sí mismo, de lo contrario (es decir, si es un contexto de navegación de nivel superior o un contexto de navegación anidado separado). |
| [Self](../../aspose.svg.window/iwindow/self/) { get; } | Devuelve el objeto WindowProxy del contexto de navegación del objeto Ventana. |
| [Top](../../aspose.svg.window/iwindow/top/) { get; } | El atributo IDL superior en el objeto Ventana de un Documento en un contexto de exploración b debe devolver el objeto WindowProxy de su contexto de exploración de nivel superior (que sería su propio objeto WindowProxy si fuera un contexto de exploración de nivel superior), si tiene uno, o su propio objeto WindowProxy de lo contrario (por ejemplo, si fuera un contexto de navegación anidado separado). |
| [Window](../../aspose.svg.window/iwindow/window/) { get; } | Devuelve el objeto WindowProxy del contexto de navegación del objeto Ventana. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Alert](../../aspose.svg.window/iwindow/alert/)(string) | Muestra una alerta modal con el mensaje dado y espera a que el usuario lo descarte |
| [Confirm](../../aspose.svg.window/iwindow/confirm/)(string) | Muestra un indicador modal Aceptar/Cancelar con el mensaje dado, espera a que el usuario lo descarte y devuelve verdadero si el usuario hace clic en Aceptar y falso si el usuario hace clic en Cancelar. |
| [Prompt](../../aspose.svg.window/iwindow/prompt/)(string, string) | Muestra un indicador de campo de texto modal con el mensaje dado, espera a que el usuario lo descarte y devuelve el valor que el usuario ingresó. Si el usuario cancela la solicitud, devuelve nulo en su lugar. Si el segundo argumento está presente, entonces el valor dado se usa como predeterminado. |

### Ver también

* interface [IDocumentView](../../aspose.svg.dom.views/idocumentview/)
* interface [IEventTarget](../../aspose.svg.dom.events/ieventtarget/)
* interface [IGlobalEventHandlers](../../aspose.svg.dom/iglobaleventhandlers/)
* interface [IWindowEventHandlers](../iwindoweventhandlers/)
* interface [IWindowTimers](../iwindowtimers/)
* espacio de nombres [Aspose.Svg.Window](../../aspose.svg.window/)
* asamblea [Aspose.SVG](../../)


