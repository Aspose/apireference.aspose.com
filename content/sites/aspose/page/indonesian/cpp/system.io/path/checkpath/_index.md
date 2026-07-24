---
title: "System::IO::Path::CheckPath metode"
linktitle: "CheckPath"
second_title: "Aspose.Page untuk C++"
description: "System::IO::Path::CheckPath metode. Menentukan apakah path yang ditentukan valid dengan memeriksa apakah mengandung karakter tidak valid. Sebuah pengecualian dilemparkan jika path mengandung karakter tidak valid di C++."
type: docs
weight: 200
url: /id/cpp/system.io/path/checkpath/
---
## Path::CheckPath method


Menentukan apakah jalur yang ditentukan valid dengan memeriksa apakah mengandung karakter tidak valid. Pengecualian dilemparkan jika jalur mengandung karakter tidak valid.

```cpp
static void System::IO::Path::CheckPath(const String &path, const String &msg=s_msg_path, bool allow_empty=true)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const String\& | Jalur yang akan diperiksa |
| msg | const String\& | Pesan yang akan diteruskan ke konstruktor objek pengecualian |
| allow_empty | bool | Menentukan apakah string kosong atau null harus dianggap sebagai path yang benar (true) atau tidak (false); jika parameter ini false dan **path** kosong maka ArgumentException dilemparkan; jika parameter ini false dan **path** null maka ArgumentNullException dilemparkan |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [Path](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
