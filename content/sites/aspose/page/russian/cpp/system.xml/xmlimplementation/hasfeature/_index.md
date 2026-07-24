---
title: "System::Xml::XmlImplementation::HasFeature метод"
linktitle: "HasFeature"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlImplementation::HasFeature метод. Проверяет, реализует ли реализация Document Object Model (DOM) конкретную функцию в C++."
type: docs
weight: 300
url: /ru/cpp/system.xml/xmlimplementation/hasfeature/
---
## XmlImplementation::HasFeature method


Проверяет, реализует ли реализация Document [Object](../../../system/object/) Model (DOM) конкретную функцию.

```cpp
bool System::Xml::XmlImplementation::HasFeature(const String &strFeature, const String &strVersion)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| strFeature | const String\& | Имя пакета функции для тестирования. Это имя не чувствительно к регистру. |
| strVersion | const String\& | Это номер версии имени пакета для тестирования. Если версия не указана (**nullptr**), поддержка любой версии функции приводит к тому, что метод возвращает **true**. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## Примечания



В следующей таблице показаны комбинации, которые заставляют **HasFeature** возвращать **true**. |||
|-|-|
| strFeature | strVersion |
| XML | 1.0 |
| XML | 2.0 |

## См. также

* Class [String](../../../system/string/)
* Class [XmlImplementation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
