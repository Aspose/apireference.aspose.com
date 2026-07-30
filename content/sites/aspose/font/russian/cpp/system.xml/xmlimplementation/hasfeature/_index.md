---
title: "Метод System::Xml::XmlImplementation::HasFeature"
linktitle: "HasFeature"
second_title: "Aspose.Font для C++"
description: "System::Xml::XmlImplementation::HasFeature метод. Проверяет, реализует ли реализация модели объектного документа (DOM) конкретную функцию в C++."
type: docs
weight: 300
url: /ru/cpp/system.xml/xmlimplementation/hasfeature/
---
## XmlImplementation::HasFeature method


Проверяет, реализует ли реализация модели объектного [Object](../../../system/object/) (DOM) конкретную функцию.

```cpp
bool System::Xml::XmlImplementation::HasFeature(const String &strFeature, const String &strVersion)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| strFeature | const String\& | Имя пакета функции для проверки. Это имя не чувствительно к регистру. |
| strVersion | const String\& | Это номер версии имени пакета для проверки. Если версия не указана (**nullptr**), поддержка любой версии функции приводит к тому, что метод возвращает **true**. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## Примечания



В следующей таблице показаны комбинации, которые вызывают возврат **true** методом **HasFeature**. |||
|-|-|
| strFeature | strVersion |
| XML | 1.0 |
| XML | 2.0 |

## См. также

* Class [String](../../../system/string/)
* Class [XmlImplementation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
