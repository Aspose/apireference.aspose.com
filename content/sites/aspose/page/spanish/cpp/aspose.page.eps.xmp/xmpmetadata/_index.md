---
title: "Aspose::Page::EPS::XMP::XmpMetadata clase"
linktitle: "XmpMetadata"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::EPS::XMP::XmpMetadata clase. Proporciona acceso al flujo de metadatos XMP en C++."
type: docs
weight: 200
url: /es/cpp/aspose.page.eps.xmp/xmpmetadata/
---
## XmpMetadata class


Proporciona acceso al flujo de metadatos [XMP](../).

```cpp
class XmpMetadata : public System::Collections::Generic::IDictionary<System::String, System::SharedPtr<XmpValue>>
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<XmpValue\>\&) override | Agrega valor a los metadatos. |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | Agrega valor a los metadatos. |
| [Add](./add/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | Agrega un par con clave y valor al diccionario. |
| [AddArrayItem](./addarrayitem/)(System::String, System::SharedPtr\<XmpValue\>) | Agrega valor a una matriz. El valor se añadirá al final de la matriz. |
| [AddArrayItem](./addarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | Agrega valor a una matriz en el índice especificado. |
| [AddNamedValue](./addnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | Agrega un valor nombrado a una estructura. |
| [Clear](./clear/)() override | Borra los metadatos. |
| [Contains](./contains/)(const System::String\&) const | Comprueba si la clave está contenida en los metadatos. |
| [Contains](./contains/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) const override | Comprueba si el par clave-valor especificado está contenido en el diccionario. |
| [ContainsKey](./containskey/)(const System::String\&) const override | Determina si este diccionario contiene la clave especificada. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\>, int32_t) override | Copia los elementos de la colección a una matriz. |
| [get_Count](./get_count/)() const override | Obtiene el recuento de elementos en la colección. |
| [get_IsFixedSize](./get_isfixedsize/)() const | Comprueba si la colección tiene tamaño fijo. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Comprueba si la colección es de solo lectura. |
| [get_IsSynchronized](./get_issynchronized/)() | Comprueba si la colección está sincronizada. |
| [get_Keys](./get_keys/)() const override | Obtiene la colección de claves de metadatos. |
| [get_NamespaceManager](./get_namespacemanager/)() | Obtiene el administrador de espacios de nombres. |
| [get_SyncRoot](./get_syncroot/)() const | Obtiene el objeto de sincronización de la colección. |
| [get_Values](./get_values/)() const override | Obtiene los valores en los metadatos. |
| [GetEnumerator](./getenumerator/)() override | Devuelve el enumerador del diccionario. |
| [GetNamespaceUriByPrefix](./getnamespaceuribyprefix/)(System::String) | Devuelve el URI del espacio de nombres por prefijo. |
| [GetPrefixByNamespaceUri](./getprefixbynamespaceuri/)(System::String) | Devuelve el prefijo por namespace URI. |
| [idx_get](./idx_get/)(const System::String\&) const override | Obtiene datos de los metadatos. |
| [idx_set](./idx_set/)(const System::String\&, System::SharedPtr\<XmpValue\>) override | Establece datos a partir de los metadatos. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String) | Registra namespace URI. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String, System::String) | Registra namespace URI. |
| [Remove](./remove/)(const System::String\&) override | Elimina la entrada de los metadatos. |
| [Remove](./remove/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | Elimina la pareja clave/valor de la colección. |
| [SetArrayItem](./setarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | Establece un valor en una matriz. El valor anterior será reemplazado por uno nuevo. |
| [SetNamedValue](./setnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | Establece un valor nombrado en una estructura. El valor nombrado anterior, si ya existe, será reemplazado por uno nuevo. |
| [TryGetValue](./trygetvalue/)(const System::String\&, System::SharedPtr\<XmpValue\>\&) const override | Intenta encontrar la clave en el diccionario y recupera el valor si se encuentra. |
## Ver también

* Class [IDictionary](../../system.collections.generic/idictionary/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
