---
title: "Clase System::Xml::Resolvers::XmlPreloadedResolver"
linktitle: "XmlPreloadedResolver"
second_title: "Aspose.Page para C++"
description: "Clase System::Xml::Resolvers::XmlPreloadedResolver. Representa una clase que se utiliza para pre‑poblar la caché con DTDs o flujos XML en C++."
type: docs
weight: 100
url: /es/cpp/system.xml.resolvers/xmlpreloadedresolver/
---
## XmlPreloadedResolver class


Representa una clase que se utiliza para precargar la caché con DTDs o flujos XML.

```cpp
class XmlPreloadedResolver : public System::Xml::XmlResolver
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&) | Agrega una matriz de bytes al almacén [XmlPreloadedResolver](./) y lo asigna a una URI. Si el almacén ya contiene una asignación para la misma URI, la asignación existente se sobrescribe. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Agrega una matriz de bytes al almacén [XmlPreloadedResolver](./) y lo asigna a una URI. Si el almacén ya contiene una asignación para la misma URI, la asignación existente se sobrescribe. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const SharedPtr\<IO::Stream\>\&) | Agrega un Stream al almacén [XmlPreloadedResolver](./) y lo asigna a una URI. Si el almacén ya contiene una asignación para la misma URI, la asignación existente se sobrescribe. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const String\&) | Agrega una cadena con datos precargados al almacén [XmlPreloadedResolver](./) y lo asigna a una URI. Si el almacén ya contiene una asignación para la misma URI, la asignación existente se sobrescribe. |
| [get_PreloadedUris](./get_preloadeduris/)() | Devuelve una colección de URIs precargados. |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | Asocia un URI a un objeto que contiene el recurso real. |
| [Remove](./remove/)(const SharedPtr\<Uri\>\&) | Elimina los datos que corresponden a la URI del [XmlPreloadedResolver](./). |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | Resuelve el URI absoluto a partir del URI base y los URIs relativos. |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | Establece las credenciales que se utilizan para autenticar la [Net::WebRequest](../../system.net/webrequest/) subyacente. |
| [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) override | Determina si el resolvedor admite otros Types además de Stream. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)() | Inicializa una nueva instancia de la clase [XmlPreloadedResolver](./). |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(XmlKnownDtds) | Inicializa una nueva instancia de la clase [XmlPreloadedResolver](./) con los DTD bien conocidos precargados especificados. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&) | Inicializa una nueva instancia de la clase [XmlPreloadedResolver](./) con el resolvedor de respaldo especificado. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds) | Inicializa una nueva instancia de la clase [XmlPreloadedResolver](./) con el resolvedor de respaldo especificado y los DTD bien conocidos precargados. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds, const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\&) | Inicializa una nueva instancia de la clase [XmlPreloadedResolver](./) con el resolvedor de respaldo especificado, los DTD bien conocidos precargados y el comparador de igualdad de URI. |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Ptr](./ptr/) | Un alias para un puntero compartido a una instancia de esta clase. |
## Observaciones



Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree instancias de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

## Ver también

* Class [XmlResolver](../../system.xml/xmlresolver/)
* Namespace [System::Xml::Resolvers](../)
* Library [Aspose.Page for C++](../../)
