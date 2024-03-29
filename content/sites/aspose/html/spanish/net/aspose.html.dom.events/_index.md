---
title: Aspose.Html.Dom.Events
second_title: Referencia de API de Aspose.HTML para .NET
description: El Aspose.Html.Dom.Eventos El espacio de nombres proporciona objetos para cualquier evento relacionado con la actualización del DOM. Incluye suscripción a observación de información contextual específica asociada al evento así como construcción de eventos personalizados.
type: docs
weight: 80
url: /es/net/aspose.html.dom.events/
---
El **Aspose.Html.Dom.Eventos** El espacio de nombres proporciona objetos para cualquier evento relacionado con la actualización del DOM. Incluye suscripción a observación de información contextual específica asociada al evento así como construcción de eventos personalizados.

## Clases

| Clase | Descripción |
| --- | --- |
| [CustomEvent](./customevent/) | Los eventos que usan la interfaz CustomEvent se pueden usar para transportar datos personalizados. |
| [DocumentLoadErrorEvent](./documentloaderrorevent/) | El[`DocumentLoadErrorEvent`](../aspose.html.dom.events/documentloaderrorevent/) ocurre cuando el recurso solicitado no está disponible. |
| [DOMEventHandler](./domeventhandler/) | Representa la devolución de llamada para el manejo de eventos. |
| [ErrorEvent](./errorevent/) | El[`ErrorEvent`](../aspose.html.dom.events/errorevent/) proporciona información contextual sobre errores que ocurrieron durante el tiempo de ejecución. |
| [Event](./event/) | El[`Event`](../aspose.html.dom.events/event/) se utiliza para proporcionar información contextual sobre un evento al controlador que procesa el evento. |
| [FocusEvent](./focusevent/) | La interfaz FocusEvent proporciona información contextual específica asociada con eventos Focus. |
| [InputEvent](./inputevent/) | Los eventos de entrada se envían como notificaciones cada vez que se actualiza el DOM. |
| [KeyboardEvent](./keyboardevent/) | La interfaz KeyboardEvent proporciona información contextual específica asociada con dispositivos de teclado. Cada evento de teclado hace referencia a una tecla usando un valor. Los eventos de teclado normalmente se dirigen al elemento que tiene el foco. |
| [MouseEvent](./mouseevent/) | La interfaz MouseEvent proporciona información contextual específica asociada con los eventos del mouse. |
| [UIEvent](./uievent/) | La interfaz UIEvent proporciona información contextual específica asociada con los eventos de la interfaz de usuario. |
| [WheelEvent](./wheelevent/) | La interfaz WheelEvent proporciona información contextual específica asociada con eventos de rueda. Para crear una instancia de la interfaz WheelEvent, use el constructor WheelEvent, pasando un diccionario WheelEventInit opcional. |
## Interfaces

| Interfaz | Descripción |
| --- | --- |
| [IDocumentEvent](./idocumentevent/) | El[`IDocumentEvent`](../aspose.html.dom.events/idocumentevent/) interfaz proporciona un mecanismo por el cual el usuario puede crear un[`Event`](../aspose.html.dom.events/event/) de un tipo soportado por la implementación. |
| [IEventListener](./ieventlistener/) | El[`IEventListener`](../aspose.html.dom.events/ieventlistener/)interfaz es el método principal para manejar eventos. Los usuarios implementan el[`IEventListener`](../aspose.html.dom.events/ieventlistener/) interfaz y registrar a su oyente en un[`EventTarget`](../aspose.html.dom/eventtarget/) utilizando el[`AddEventListener`](../aspose.html.dom/eventtarget/addeventlistener/) method. Los usuarios también deben eliminar su[`IEventListener`](../aspose.html.dom.events/ieventlistener/) de su[`EventTarget`](../aspose.html.dom/eventtarget/) después de que hayan completado el uso de listener. |
| [IEventTarget](./ieventtarget/) | El[`EventTarget`](../aspose.html.dom/eventtarget/) Todos los nodos implementan la interfaz en una implementación que admite el modelo de eventos DOM. Por lo tanto, esta interfaz se puede obtener utilizando métodos de conversión específicos de vinculación en una instancia de la interfaz de nodo. La interfaz permite el registro y la eliminación de escuchas de eventos en un[`EventTarget`](../aspose.html.dom/eventtarget/) y envío de eventos a ese[`IEventTarget`](../aspose.html.dom.events/ieventtarget/) . |


