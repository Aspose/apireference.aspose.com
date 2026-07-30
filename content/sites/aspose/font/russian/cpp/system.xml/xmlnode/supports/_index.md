---
title: "Метод System::Xml::XmlNode::Supports"
linktitle: "Supports"
second_title: "Aspose.Font для C++"
description: "Метод System::Xml::XmlNode::Supports. Проверяет, реализует ли DOM‑реализация определённую функцию в C++."
type: docs
weight: 4400
url: /ru/cpp/system.xml/xmlnode/supports/
---
## XmlNode::Supports method


Проверяет, реализует ли реализация DOM конкретную возможность.

```cpp
virtual bool System::Xml::XmlNode::Supports(String feature, String version)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| функция | String | Имя пакета функции для проверки. Это имя не чувствительно к регистру. |
| версия | String | Номер версии имени пакета для проверки. Если версия не указана (null), поддержка любой версии функции приводит к тому, что метод возвращает true. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## Примечания



Следующая таблица описывает комбинации, которые возвращают **true**. |||
|-|-|
| Функция | Версия |
| XML | 1.0 |
| XML | 2.0 |

## См. также

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
