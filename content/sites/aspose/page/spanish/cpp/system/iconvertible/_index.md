---
title: "Clase System::IConvertible"
linktitle: "IConvertible"
second_title: "Aspose.Page para C++"
description: "Clase System::IConvertible. Define métodos que convierten el valor del tipo de referencia o valor que implementa en un tipo de tiempo de ejecución de lenguaje común que tiene un valor equivalente. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 3400
url: /es/cpp/system/iconvertible/
---
## IConvertible class


Define métodos que convierten el valor del tipo de referencia o valor que implementa en un tipo de tiempo de ejecución de lenguaje común que tiene un valor equivalente. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class IConvertible : public virtual System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() | Devuelve el código de tipo de esta instancia. |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<System::IFormatProvider\>) | Convierte el valor de esta instancia a un valor [Boolean](../boolean/) equivalente utilizando la información de formato específica de la cultura indicada. |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<System::IFormatProvider\>) | Convierte el valor de esta instancia a un entero uint32_teger de 8 bits equivalente utilizando la información de formato específica de la cultura indicada. |
| virtual [ToChar](./tochar/)(System::SharedPtr\<System::IFormatProvider\>) | Convierte el valor de esta instancia a un carácter Unicode equivalente utilizando la información de formato específica de la cultura indicada. |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<System::IFormatProvider\>) | Convierte el valor de esta instancia a un [System::DateTime](../datetime/) equivalente utilizando la información de formato específica de la cultura indicada. |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<System::IFormatProvider\>) | Convierte el valor de esta instancia a un número [System::Decimal](../decimal/) equivalente utilizando la información de formato específica de la cultura indicada. |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<System::IFormatProvider\>) | Convierte el valor de esta instancia a un número de punto flotante de doble precisión equivalente utilizando la información de formato específica de la cultura indicada. |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<System::IFormatProvider\>) | Convierte el valor de esta instancia a un entero con signo de 16 bits equivalente utilizando la información de formato específica de la cultura indicada. |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<System::IFormatProvider\>) | Convierte el valor de esta instancia a un entero con signo de 32 bits equivalente utilizando la información de formato específica de la cultura indicada. |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<System::IFormatProvider\>) | Convierte el valor de esta instancia a un entero con signo de 64 bits equivalente utilizando la información de formato específica de la cultura indicada. |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<System::IFormatProvider\>) | Convierte el valor de esta instancia a un entero con signo de 8 bits equivalente utilizando la información de formato específica de la cultura indicada. |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<System::IFormatProvider\>) | Convierte el valor de esta instancia a un número de punto flotante de precisión simple equivalente utilizando la información de formato específica de la cultura indicada. |
| virtual [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | Convierte el valor de esta instancia a un [System::String](../string/) equivalente utilizando la información de formato específica de la cultura indicada. |
| virtual [ToString](./tostring/)() const | Análogo del método C# [Object.ToString()](../object/tostring/). Permite convertir objetos personalizados a cadena. |
| virtual [ToType](./totype/)(const TypeInfo\&, System::SharedPtr\<System::IFormatProvider\>) | Convierte el valor de esta instancia a un [System::Object](../object/) del System::Type especificado que tiene un valor equivalente, utilizando la información de formato específica de la cultura indicada. |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<System::IFormatProvider\>) | Convierte el valor de esta instancia a un uint32_teger de 16 bits equivalente utilizando la información de formato específica de la cultura indicada. |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<System::IFormatProvider\>) | Convierte el valor de esta instancia a un uint32_teger de 32 bits equivalente usando la información de formato específica de la cultura. |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<System::IFormatProvider\>) | Convierte el valor de esta instancia a un uint32_teger de 64 bits equivalente usando la información de formato específica de la cultura. |
## Ver también

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
