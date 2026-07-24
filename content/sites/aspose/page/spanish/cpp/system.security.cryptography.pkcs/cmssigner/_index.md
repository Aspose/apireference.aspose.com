---
title: "System::Security::Cryptography::Pkcs::CmsSigner clase"
linktitle: "CmsSigner"
second_title: "Aspose.Page para C++"
description: "System::Security::Cryptography::Pkcs::CmsSigner clase. Proporciona una API para firmar objetos usando CMS. No firma los objetos por sí mismo, utilice la clase SignedCMS para hacerlo. No está implementado. Los objetos de esta clase solo deben ser asignados usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 100
url: /es/cpp/system.security.cryptography.pkcs/cmssigner/
---
## CmsSigner class


Proporciona una API para firmar objetos usando CMS. No firma los objetos por sí mismo, utilice la clase SignedCMS para hacerlo. No está implementado. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class CmsSigner : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| [CmsSigner](./cmssigner/)(const SharedPtr\<X509Certificates::X509Certificate2\>\&) | Inicializa el firmante con un certificado X509. |
| [get_DigestAlgorithm](./get_digestalgorithm/)() const | Obtiene el algoritmo de hash utilizado con la firma. |
| [get_IncludeOption](./get_includeoption/)() const | Comprueba qué certificados de la cadena se incluirán en la firma. |
| [set_DigestAlgorithm](./set_digestalgorithm/)(const SharedPtr\<Oid\>\&) | Establece el algoritmo de hash utilizado con la firma. |
| [set_IncludeOption](./set_includeoption/)(X509Certificates::X509IncludeOption) | Especifica qué certificados de la cadena se incluirán en la firma. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Page for C++](../../)
