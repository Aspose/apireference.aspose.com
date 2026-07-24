---
title: "Aspose::Page::EPS::XMP::XmpMetadata::Remove method"
linktitle: "Remove"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::EPS::XMP::XmpMetadata::Remove method. Elimina el par clave/valor de la colección en C++."
type: docs
weight: 2200
url: /es/cpp/aspose.page.eps.xmp/xmpmetadata/remove/
---
## XmpMetadata::Remove(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) method


Elimina la pareja clave/valor de la colección.

```cpp
bool Aspose::Page::EPS::XMP::XmpMetadata::Remove(const System::Collections::Generic::KeyValuePair<System::String, System::SharedPtr<XmpValue>> &item) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| item | const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\& | Par clave/valor a eliminar. |

### ReturnValue

true si se encontró y eliminó el par.

## Ver también

* Class [KeyValuePair](../../../system.collections.generic/keyvaluepair/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmpValue](../../xmpvalue/)
* Class [XmpMetadata](../)
* Namespace [Aspose::Page::EPS::XMP](../../)
* Library [Aspose.Page for C++](../../../)
## XmpMetadata::Remove(const System::String\&) method


Elimina la entrada de los metadatos.

```cpp
bool Aspose::Page::EPS::XMP::XmpMetadata::Remove(const System::String &key) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | const System::String\& | La clave de la entrada a eliminar. |

### ReturnValue

True - si la clave se elimina; de lo contrario, false.

## Ver también

* Class [String](../../../system/string/)
* Class [XmpMetadata](../)
* Namespace [Aspose::Page::EPS::XMP](../../)
* Library [Aspose.Page for C++](../../../)
