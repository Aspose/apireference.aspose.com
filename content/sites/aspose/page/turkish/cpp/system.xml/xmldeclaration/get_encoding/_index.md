---
title: "System::Xml::XmlDeclaration::get_Encoding yöntemi"
linktitle: "get_Encoding"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlDeclaration::get_Encoding yöntemi. XML belgesinin kodlama seviyesini C++'de döndürür."
type: docs
weight: 200
url: /tr/cpp/system.xml/xmldeclaration/get_encoding/
---
## XmlDeclaration::get_Encoding method


XML belgesinin kodlama seviyesini döndürür.

```cpp
String System::Xml::XmlDeclaration::get_Encoding()
```


### ReturnValue

Geçerli karakter kodlama adı.
## Açıklamalar



XML için en yaygın olarak desteklenen karakter kodlama adları aşağıdakilerdir: |||
|-|-|
| Kategori | Kodlama Adları |
| Unicode | UTF-8, UTF-16 |
| ISO 10646 | ISO-10646-UCS-2, ISO-10646-UCS-4 |
| ISO 8859 | ISO-8859-n ("n" bir 1'den 9'a kadar rakamdır) |
| JIS X-0208-1997 | ISO-2022-JP, Shift_JIS, EUC-JP |

Bu değer isteğe bağlıdır. Bir değer ayarlanmamışsa, bu yöntem [String::Empty](../../../system/string/empty/) döndürür. Bir kodlama özniteliği dahil edilmemişse, belge yazıldığında veya kaydedildiğinde UTF-8 kodlaması varsayılır.
## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
