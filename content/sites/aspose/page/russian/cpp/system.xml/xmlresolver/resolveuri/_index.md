---
title: "System::Xml::XmlResolver::ResolveUri метод"
linktitle: "ResolveUri"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlResolver::ResolveUri метод. При переопределении в производном классе определяет абсолютный URI из базового и относительного URI в C++."
type: docs
weight: 200
url: /ru/cpp/system.xml/xmlresolver/resolveuri/
---
## XmlResolver::ResolveUri method


Когда переопределяется в производном классе, разрешает абсолютный URI из базового и относительных URI.

```cpp
virtual SharedPtr<Uri> System::Xml::XmlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | Базовый URI, используемый для разрешения относительного URI. |
| relativeUri | String | URI для разрешения. URI может быть абсолютным или относительным. Если абсолютный, это значение эффективно заменяет значение **baseUri**. Если относительный, оно комбинируется с **baseUri**, образуя абсолютный URI. |

### ReturnValue

Абсолютный URI или **nullptr**, если относительный URI не может быть разрешён.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
