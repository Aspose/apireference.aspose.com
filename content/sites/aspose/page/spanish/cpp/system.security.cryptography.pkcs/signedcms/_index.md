---
title: "Clase System::Security::Cryptography::Pkcs::SignedCms"
linktitle: "SignedCms"
second_title: "Aspose.Page para C++"
description: "Clase System::Security::Cryptography::Pkcs::SignedCms. Firma el contenido según el estándar CMS/PKCS #7. No implementado. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 300
url: /es/cpp/system.security.cryptography.pkcs/signedcms/
---
## SignedCms class


Firma el contenido según el estándar CMS/PKCS #7. No implementado. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class SignedCms : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| [ComputeSignature](./computesignature/)(const SharedPtr\<CmsSigner\>\&, bool) | Crea una firma. |
| [Encode](./encode/)() | Codifica un mensaje CMS/PKCS #7. |
| [SignedCms](./signedcms/)(const SharedPtr\<ContentInfo\>\&, bool) | Constructor. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Page for C++](../../)
