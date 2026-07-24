---
title: "System::Xml::XmlReader::ReadElementContentAsBinHex метод"
linktitle: "ReadElementContentAsBinHex"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlReader::ReadElementContentAsBinHex метод. Читает элемент и декодирует содержимое BinHex в C++."
type: docs
weight: 5400
url: /ru/cpp/system.xml/xmlreader/readelementcontentasbinhex/
---
## XmlReader::ReadElementContentAsBinHex method


Считывает элемент и декодирует содержимое **BinHex**.

```cpp
virtual int32_t System::Xml::XmlReader::ReadElementContentAsBinHex(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| буфер | ArrayPtr\<uint8_t\> | Буфер, в который копируется полученный текст. Это значение не может быть **nullptr**. |
| индекс | int32_t | Смещение в буфере, с которого начинается копирование результата. |
| count | int32_t | Максимальное количество байтов для копирования в буфер. Фактическое количество скопированных байтов возвращается этим методом. |

### ReturnValue

Количество байтов, записанных в буфер.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
