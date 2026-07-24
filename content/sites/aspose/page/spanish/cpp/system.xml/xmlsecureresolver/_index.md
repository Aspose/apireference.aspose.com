---
title: "Clase System::Xml::XmlSecureResolver"
linktitle: "XmlSecureResolver"
second_title: "Aspose.Page para C++"
description: "Clase System::Xml::XmlSecureResolver. Ayuda a asegurar otra implementación de XmlResolver envolviendo el objeto XmlResolver y restringiendo los recursos a los que el XmlResolver subyacente tiene acceso en C++."
type: docs
weight: 3600
url: /es/cpp/system.xml/xmlsecureresolver/
---
## XmlSecureResolver class


Ayuda a asegurar otra implementación de [XmlResolver](../xmlresolver/) envolviendo el objeto [XmlResolver](../xmlresolver/) y restringiendo los recursos a los que el [XmlResolver](../xmlresolver/) subyacente tiene acceso.

```cpp
class XmlSecureResolver : public System::Xml::XmlResolver
```

## Métodos

| Método | Descripción |
| --- | --- |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | Asocia un URI a un objeto que contiene el recurso real. |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | Resuelve el URI absoluto a partir del URI base y los URIs relativos llamando a **ResolveUri** en el [XmlResolver](../xmlresolver/) subyacente. |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | Establece las credenciales usadas para autenticar solicitudes web. |
| [XmlSecureResolver](./xmlsecureresolver/)(const SharedPtr\<XmlResolver\>\&, const String\&) | Inicializa una nueva instancia de la clase [XmlSecureResolver](./) con el [XmlResolver](../xmlresolver/) y la URL proporcionada. |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Ptr](./ptr/) | Un alias para un puntero compartido a una instancia de esta clase. |
## Observaciones



Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree instancias de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

## Ver también

* Class [XmlResolver](../xmlresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
