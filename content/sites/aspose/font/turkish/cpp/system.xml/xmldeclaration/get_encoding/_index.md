---
title: "System::Xml::XmlDeclaration::get_Encoding metodu"
linktitle: "get_Encoding"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlDeclaration::get_Encoding metodu. XML belgesinin kodlama seviyesini C++'da döndürür."
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



XML için en yaygın desteklenen karakter kodlama adları aşağıdakilerdir: |||
|-|-|
| Kategori | Kodlama Adları |
| Unicode | UTF-8, UTF-16 |
| ISO 10646 | ISO-10646-UCS-2, ISO-10646-UCS-4 |
| ISO 8859 | ISO-8859-n (burada "n" 1 ile 9 arasında bir rakamdır) |
| JIS X-0208-1997 | ISO-2022-JP, Shift_JIS, EUC-JP |

Bu değer isteğe bağlıdır. Bir değer ayarlanmamışsa, bu yöntem [String::Empty](../../../system/string/empty/) döndürür. Bir kodlama özniteliği eklenmemişse, belge yazıldığında veya kaydedildiğinde UTF-8 kodlaması varsayılır.
## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
