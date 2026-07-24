---
title: "System::Security::Cryptography::AsnEncodedData class"
linktitle: "AsnEncodedData"
second_title: "Aspose.Page para C++"
description: "System::Security::Cryptography::AsnEncodedData class. Datos codificados en ASN.1. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject() function. Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarla a funciones como argumento en C++."
type: docs
weight: 100
url: /es/cpp/system.security.cryptography/asnencodeddata/
---
## AsnEncodedData class


Datos codificados en ASN.1. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../../system/makeobject/) function. Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarla a funciones como argumento.

```cpp
class AsnEncodedData : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<AsnEncodedData\>\&) | Información RTTI. |
| [AsnEncodedData](./asnencodeddata/)(const ByteArrayPtr\&) | Constructor. |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&) | Constructor. |
| [AsnEncodedData](./asnencodeddata/)(const String\&, const ByteArrayPtr\&) | Constructor. |
| virtual [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) | Copia datos de otro objeto. |
| virtual [Format](./format/)(bool) const | Formatea los datos en una forma legible para humanos. |
| [get_Oid](./get_oid/)() const | Obtiene el identificador de objeto de los datos codificados. |
| [get_RawData](./get_rawdata/)() const | Obtiene los datos codificados sin procesar. |
| [set_Oid](./set_oid/)(const SharedPtr\<Oid\>\&) | Establece el identificador de objeto de los datos codificados. |
| [set_RawData](./set_rawdata/)(const ByteArrayPtr\&) | Establece los datos codificados sin procesar. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
