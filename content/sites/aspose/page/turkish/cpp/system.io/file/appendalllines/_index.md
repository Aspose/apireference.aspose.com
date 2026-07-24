---
title: "System::IO::File::AppendAllLines yöntemi"
linktitle: "AppendAllLines"
second_title: "Aspose.Page için C++"
description: "System::IO::File::AppendAllLines yöntemi. Belirtilen kodlama kullanılarak, belirtilen dize koleksiyonundaki dizeleri belirtilen dosyaya her birini yeni bir satıra yazarak ekler. Belirtilen dosya yoksa, oluşturulur. Tüm dizeler yazıldıktan sonra dosya C++'ta kapatılır."
type: docs
weight: 100
url: /tr/cpp/system.io/file/appendalllines/
---
## File::AppendAllLines method


Belirtilen kodlama kullanılarak, belirtilen dize koleksiyonundaki dizeleri belirtilen dosyaya her birini yeni bir satıra yazarak ekler. Belirtilen dosya mevcut değilse, oluşturulur. Tüm dizeler yazıldıktan sonra dosya kapatılır.

```cpp
static void System::IO::File::AppendAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yol | const String\& | Dizelerin ekleneceği dosyanın yolu |
| içerikler | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | Dosyaya yazılacak dizeler |
| encoding | const EncodingPtr\& | Kullanılacak karakter kodlaması |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
