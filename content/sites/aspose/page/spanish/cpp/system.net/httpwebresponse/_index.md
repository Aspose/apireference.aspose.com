---
title: "Clase System::Net::HttpWebResponse"
linktitle: "HttpWebResponse"
second_title: "Aspose.Page para C++"
description: "Clase System::Net::HttpWebResponse. Representa la respuesta web HTTP. Los objetos de esta clase solo deben ser asignados usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 2100
url: /es/cpp/system.net/httpwebresponse/
---
## HttpWebResponse class


Representa la respuesta web HTTP. Los objetos de esta clase solo deben ser asignados usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class HttpWebResponse : public System::Net::WebResponse
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Close](./close/)() override | Cierra el flujo de respuesta. |
| [get_CharacterSet](./get_characterset/)() | No implementado. |
| [get_ContentLength](./get_contentlength/)() override | Información RTTI. |
| [get_ContentType](./get_contenttype/)() override | Devuelve el tipo MIME del recurso. |
| virtual [get_Cookies](./get_cookies/)() | Devuelve cookies asociadas con la respuesta web. |
| [get_Headers](./get_headers/)() override | Devuelve la colección de encabezados que están asociados con la respuesta actual. |
| virtual [get_Method](./get_method/)() | Devuelve el método HTTP. |
| [get_ResponseUri](./get_responseuri/)() override | Devuelve la URI del recurso. |
| virtual [get_StatusCode](./get_statuscode/)() | Devuelve el código de estado HTTP asociado a la respuesta web. |
| virtual [get_StatusDescription](./get_statusdescription/)() | Devuelve la representación en cadena del código de estado. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | Devuelve un valor que indica si la respuesta actual admite encabezados. |
| [GetResponseHeader](./getresponseheader/)(String) | Devuelve el valor correspondiente para el nombre de encabezado especificado. |
| [GetResponseStream](./getresponsestream/)() override | Devuelve el flujo de la respuesta. |
| [HttpWebResponse](./httpwebresponse/)(System::SharedPtr\<Http::HttpResponseMessage\>, System::SharedPtr\<Uri\>, System::SharedPtr\<CookieContainer\>) | Construye una nueva instancia. |
## Ver también

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
