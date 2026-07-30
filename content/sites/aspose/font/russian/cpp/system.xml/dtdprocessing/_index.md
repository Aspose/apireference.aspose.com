---
title: "System::Xml::DtdProcessing enum"
linktitle: "DtdProcessing"
second_title: "Aspose.Font для C++"
description: "System::Xml::DtdProcessing enum. Указывает варианты обработки DTD. Перечисление DtdProcessing используется классом XmlReaderSettings в C++."
type: docs
weight: 4700
url: /ru/cpp/system.xml/dtdprocessing/
---
## DtdProcessing enum


Указывает варианты обработки DTD. Перечисление [DtdProcessing](./) используется классом [XmlReaderSettings](../xmlreadersettings/).

```cpp
enum class DtdProcessing
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| Prohibit | 0 | Указывает, что при обнаружении DTD генерируется [XmlException](../xmlexception/) с сообщением, указывающим, что DTD запрещены. Это поведение по умолчанию. |
| Игнорировать | 1 | Вызывает игнорирование элемента DOCTYPE. Обработка DTD не происходит, и DTD/DOCTYPE теряется при выводе. |
| Разбор | 2 | Используется для разбора DTD. |

## См. также

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
