---
title: "Clase System::Net::Http::Headers::TransferCodingHeaderValue"
linktitle: "TransferCodingHeaderValue"
second_title: "Aspose.Page para C++"
description: "Clase System::Net::Http::Headers::TransferCodingHeaderValue. Representa un valor del encabezado ''Accept-Encoding'' header. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject() function. Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 2400
url: /es/cpp/system.net.http.headers/transfercodingheadervalue/
---
## TransferCodingHeaderValue class


Representa un valor del encabezado 'Accept-Encoding' header. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/) function. Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class TransferCodingHeaderValue : public virtual System::ICloneable
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compara objetos usando la semántica de C# [Object.Equals](../../system/object/equals/). |
| [get_Parameters](./get_parameters/)() | Devuelve los parámetros. |
| [get_Value](./get_value/)() | Información RTTI. |
| [GetHashCode](./gethashcode/)() const override | Análogo del método C# [Object.GetHashCode()](../../system/object/gethashcode/). Permite el hash de objetos personalizados. |
| static [GetTransferCodingLength](./gettransfercodinglength/)(String, int32_t, const HeaderFunc\<System::SharedPtr\<TransferCodingHeaderValue\>\>\&, System::SharedPtr\<TransferCodingHeaderValue\>\&) | Convierte una cadena pasada desde el índice especificado a una instancia de la clase [TransferCodingHeaderValue](./) class. |
| static [Parse](./parse/)(String) | Convierte una cadena pasada a una instancia de la clase [TransferCodingHeaderValue](./) class. |
| [ToString](./tostring/)() const override | Análogo del método C# [Object.ToString()](../../system/object/tostring/). Permite convertir objetos personalizados a cadena. |
| [TransferCodingHeaderValue](./transfercodingheadervalue/)() | Construye una nueva instancia. |
| [TransferCodingHeaderValue](./transfercodingheadervalue/)(String) | Construye una nueva instancia. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<TransferCodingHeaderValue\>\&) | Intenta convertir una cadena pasada a una instancia de la clase [TransferCodingHeaderValue](./) class. |
## Ver también

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
