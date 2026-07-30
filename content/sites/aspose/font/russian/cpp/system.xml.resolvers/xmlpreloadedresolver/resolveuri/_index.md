---
title: "метод System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri"
linktitle: "ResolveUri"
second_title: "Aspose.Font для C++"
description: "метод System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri. Разрешает абсолютный URI из базового и относительного URI в C++."
type: docs
weight: 600
url: /ru/cpp/system.xml.resolvers/xmlpreloadedresolver/resolveuri/
---
## XmlPreloadedResolver::ResolveUri method


Разрешает абсолютный URI из базового и относительного URI.

```cpp
SharedPtr<Uri> System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | Базовый URI, используемый для разрешения относительного URI. |
| relativeUri | String | URI для разрешения. URI может быть абсолютным или относительным. Если абсолютный, это значение эффективно заменяет значение **baseUri**. Если относительный, он комбинируется с **baseUri**, чтобы получить абсолютный URI. |

### ReturnValue

Объект [Uri](../../../system/uri/), представляющий абсолютный URI, или **nullptr**, если относительный URI не может быть разрешён.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
