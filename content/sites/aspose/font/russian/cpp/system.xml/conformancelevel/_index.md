---
title: "enum System::Xml::ConformanceLevel"
linktitle: "ConformanceLevel"
second_title: "Aspose.Font для C++"
description: "enum System::Xml::ConformanceLevel. Указывает объём проверки ввода или вывода, которую выполняют объекты XmlReader и XmlWriter в C++."
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
| Auto | 0 | Объект [XmlReader](../xmlreader/) или [XmlWriter](../xmlwriter/) автоматически определяет, следует ли выполнять проверку на уровне документа или фрагмента, и выполняет соответствующую проверку. Если вы оборачиваете другой объект [XmlReader](../xmlreader/) или [XmlWriter](../xmlwriter/), внешний объект не выполняет дополнительную проверку соответствия. Проверка соответствия оставляется на усмотрение базового объекта. |
| Fragment | 1 | Данные XML являются [well-formed XML fragment](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities), как определено W3C. Этот уровень соответствия представляет XML‑документ, который может не иметь корневого элемента, но в остальном корректен. Этот уровень проверки гарантирует, что поток, читаемый или записываемый, может быть использован любым процессором как [XML 1.0 external parsed entity](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities). |
| Document | 2 | Данные XML соответствуют правилам корректного [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed), как определено W3C. Этот уровень проверки гарантирует, что поток, читаемый или записываемый, может быть использован любым процессором как [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed). |

## См. также

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
