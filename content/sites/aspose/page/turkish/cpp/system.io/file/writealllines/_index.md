---
title: "System::IO::File::WriteAllLines yöntemi"
linktitle: "WriteAllLines"
second_title: "Aspose.Page için C++"
description: "System::IO::File::WriteAllLines yöntemi. Belirtilen kodlamayı kullanarak yeni bir metin dosyası oluşturur veya mevcut dosyanın üzerine yazar ve belirtilen dizi içindeki tüm dizeleri dosyaya yazar, her dize yeni bir satıra konur, C++'ta."
type: docs
weight: 3600
url: /tr/cpp/system.io/file/writealllines/
---
## File::WriteAllLines(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) method


Belirtilen kodlamayı kullanarak yeni bir metin dosyası oluşturur veya mevcut dosyanın üzerine yazar ve belirtilen dizi stringindeki tüm stringleri dosyaya yazar, her string yeni bir satıra.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const ArrayPtr<String> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yol | const String\& | Oluşturulacak veya üzerine yazılacak dosya |
| içerikler | const ArrayPtr\<String\>\& | Bir dize dizisi |
| encoding | const EncodingPtr\& | Kullanılacak karakter kodlaması |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## File::WriteAllLines(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) method


Belirtilen kodlamayı kullanarak yeni bir metin dosyası oluşturur veya mevcut dosyanın üzerine yazar ve belirtilen enumerable string koleksiyonundaki tüm stringleri dosyaya yazar, her string yeni bir satıra.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yol | const String\& | Oluşturulacak veya üzerine yazılacak dosya |
| içerikler | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | Dizelerden oluşan bir yinelenebilir koleksiyon |
| encoding | const EncodingPtr\& | Kullanılacak karakter kodlaması |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
