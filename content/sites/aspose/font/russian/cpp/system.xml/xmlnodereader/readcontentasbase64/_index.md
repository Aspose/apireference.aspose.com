---
title: "System::Xml::XmlNodeReader::ReadContentAsBase64 метод"
linktitle: "ReadContentAsBase64"
second_title: "Aspose.Font для C++"
description: "System::Xml::XmlNodeReader::ReadContentAsBase64 метод. Считывает контент и возвращает декодированные из Base64 бинарные байты в C++."
type: docs
weight: 3200
url: /ru/cpp/system.xml/xmlnodereader/readcontentasbase64/
---
## XmlNodeReader::ReadContentAsBase64 method


Читает содержимое и возвращает бинарные байты, декодированные из Base64.

```cpp
int32_t System::Xml::XmlNodeReader::ReadContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| buffer | The number of attributes on the current node. This number includes default attributes. | The number of attributes on the current node. This number includes default attributes. |
| индекс | int32_t | The number of attributes on the current node. This number includes default attributes. |
| count | int32_t | Максимальное количество байтов для копирования в буфер. Фактическое количество скопированных байтов возвращается этим методом. |

### ReturnValue

Количество байтов, записанных в буфер.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
