---
title: "System::Xml::ConformanceLevel enum"
linktitle: "ConformanceLevel"
second_title: "Aspose.Page для C++"
description: "System::Xml::ConformanceLevel enum. Указывает объём проверки ввода или вывода, которую выполняют объекты XmlReader и XmlWriter в C++."
type: docs
weight: 4600
url: /ru/cpp/system.xml/conformancelevel/
---
## ConformanceLevel enum


Указывает объём проверки ввода или вывода, которую выполняют объекты [XmlReader](../xmlreader/) и [XmlWriter](../xmlwriter/).

```cpp
enum class ConformanceLevel
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| Auto | 0 | Объект [XmlReader](../xmlreader/) или [XmlWriter](../xmlwriter/) автоматически определяет, должна ли выполняться проверка на уровне документа или фрагмента, и проводит соответствующую проверку. Если вы оборачиваете другой объект [XmlReader](../xmlreader/) или [XmlWriter](../xmlwriter/), внешний объект не выполняет дополнительную проверку соответствия. Проверка соответствия передаётся базовому объекту. |
| Fragment | 1 | Данные XML являются [правильно сформированным фрагментом XML](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities), как определено W3C. Этот уровень соответствия представляет XML‑документ, который может не иметь корневого элемента, но в остальном является правильно сформированным. Такой уровень проверки гарантирует, что поток, читаемый или записываемый, может быть обработан любым процессором как [внешняя разобранная сущность XML 1.0](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities). |
| Document | 2 | Данные XML соответствуют правилам правильно сформированного [документа XML 1.0](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed), как определено W3C. Этот уровень проверки гарантирует, что поток, читаемый или записываемый, может быть обработан любым процессором как [документ XML 1.0](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed). |

## См. также

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
