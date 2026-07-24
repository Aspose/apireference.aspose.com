---
title: "System::SafeInvoke method"
linktitle: "SafeInvoke"
second_title: "Aspose.Page untuk C++"
description: "System::SafeInvoke method. Implementasi terjemahan operator ''?.'' dalam C++."
type: docs
weight: 36900
url: /id/cpp/system/safeinvoke/
---
## System::SafeInvoke method


Implementasi terjemahan operator '?.'.

```cpp
template<typename T0,typename T1> static auto System::SafeInvoke(T0 expr, T1 func)
```


| Parameter | Deskripsi |
| --- | --- |
| T0 | tipe ekspresi. |
| T1 | Tipe lambda yang membungkus ekspresi 'WhenTrue'. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| expr | T0 | nilai ekspresi. |
| func | T1 | 'WhenTrue' ekspresi terikat ke funktor. |

### ReturnValue

Jika nilai expr tidak null, mengembalikan func yang dipanggil dengan nilainya sebagai argumen pertama, jika tidak mengembalikan null.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
