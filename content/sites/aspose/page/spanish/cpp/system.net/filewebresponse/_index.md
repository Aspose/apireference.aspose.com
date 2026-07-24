---
title: "Clase System::Net::FileWebResponse"
linktitle: "FileWebResponse"
second_title: "Aspose.Page para C++"
description: "Clase System::Net::FileWebResponse. Proporciona una implementación de la clase abstracta WebResponse para trabajar con el sistema de archivos. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 1100
url: /es/cpp/system.net/filewebresponse/
---
## FileWebResponse class


Proporciona una implementación de la clase abstracta [WebResponse](../webresponse/) para trabajar con el sistema de archivos. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class FileWebResponse : public System::Net::WebResponse
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Close](./close/)() override | Cierra el flujo de respuesta. |
| [FileWebResponse](./filewebresponse/)(System::SharedPtr\<Uri\>) | Construye una nueva instancia. |
| [get_ContentLength](./get_contentlength/)() override | Información RTTI. |
| [get_ContentType](./get_contenttype/)() override | Devuelve el tipo MIME del recurso. |
| [get_Headers](./get_headers/)() override | Devuelve la colección de encabezados que están asociados con la respuesta actual. |
| [get_ResponseUri](./get_responseuri/)() override | Devuelve la URI del recurso. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | Devuelve un valor que indica si la respuesta actual admite encabezados. |
| [GetResponseStream](./getresponsestream/)() override | Devuelve el flujo de la respuesta. |
## Ver también

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
