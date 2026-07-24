---
title: "Clase System::Net::Http::Headers::ProductInfoHeaderValue"
linktitle: "ProductInfoHeaderValue"
second_title: "Aspose.Page para C++"
description: "Clase System::Net::Http::Headers::ProductInfoHeaderValue. Representa un producto o un comentario en el valor del encabezado ''User-Agent'' header. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject() function. Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 1800
url: /es/cpp/system.net.http.headers/productinfoheadervalue/
---
## ProductInfoHeaderValue class


Representa un producto o un comentario en el valor del encabezado 'User-Agent' header. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/) function. Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class ProductInfoHeaderValue : public System::ICloneable
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compara objetos usando la semántica de C# [Object.Equals](../../system/object/equals/). |
| [get_Comment](./get_comment/)() | Devuelve un comentario. |
| [get_Product](./get_product/)() | Información RTTI. |
| [GetHashCode](./gethashcode/)() const override | Análogo del método C# [Object.GetHashCode()](../../system/object/gethashcode/). Permite el hash de objetos personalizados. |
| static [GetProductInfoLength](./getproductinfolength/)(String, int32_t, System::SharedPtr\<ProductInfoHeaderValue\>\&) | Convierte una cadena pasada desde el índice especificado a una instancia de la clase [ProductInfoHeaderValue](./) class. |
| static [Parse](./parse/)(String) | Convierte una cadena pasada a una instancia de la clase [ProductInfoHeaderValue](./) class. |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(String, String) | Construye una nueva instancia. |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(System::SharedPtr\<ProductHeaderValue\>) | Construye una nueva instancia. |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(String) | Construye una nueva instancia. |
| [ToString](./tostring/)() const override | Análogo del método C# [Object.ToString()](../../system/object/tostring/). Permite convertir objetos personalizados a cadena. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ProductInfoHeaderValue\>\&) | Intenta convertir una cadena pasada a una instancia de la clase [ProductInfoHeaderValue](./) class. |
## Ver también

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
