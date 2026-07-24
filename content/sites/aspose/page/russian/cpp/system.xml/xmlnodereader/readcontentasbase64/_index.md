---
title: "System::Xml::XmlNodeReader::ReadContentAsBase64 метод"
linktitle: "ReadContentAsBase64"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlNodeReader::ReadContentAsBase64 метод. Считывает содержимое и возвращает бинарные байты, декодированные из Base64, в C++."
type: docs
weight: 3200
url: /ru/cpp/system.xml/xmlnodereader/readcontentasbase64/
---
## XmlNodeReader::ReadContentAsBase64 method


Читает содержимое и возвращает двоичные байты, декодированные из Base64.

```cpp
int32_t System::Xml::XmlNodeReader::ReadContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
