---
title: "System::IO::Path::CheckPath yöntemi"
linktitle: "CheckPath"
second_title: "Aspose.Page için C++"
description: "System::IO::Path::CheckPath yöntemi. Belirtilen yolun geçerli olup olmadığını, geçersiz karakterler içerip içermediğini kontrol ederek belirler. C++'ta yol geçersiz karakterler içeriyorsa bir istisna fırlatılır."
type: docs
weight: 200
url: /tr/cpp/system.io/path/checkpath/
---
## Path::CheckPath method


Belirtilen yolun geçerli olup olmadığını, geçersiz karakterler içerip içermediğini kontrol ederek belirler. Yol geçersiz karakterler içeriyorsa bir istisna fırlatılır.

```cpp
static void System::IO::Path::CheckPath(const String &path, const String &msg=s_msg_path, bool allow_empty=true)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yol | const String\& | Kontrol edilecek yol |
| msg | const String\& | İstisna nesnesinin yapıcı metoduna geçirilecek mesaj |
| allow_empty | bool | Boş veya null bir dizenin doğru bir yol olarak kabul edilip edilmeyeceğini (doğru) belirtir; bu parametre false ve **path** boş ise bir ArgumentException fırlatılır; bu parametre false ve **path** null ise bir ArgumentNullException fırlatılır. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [Path](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
