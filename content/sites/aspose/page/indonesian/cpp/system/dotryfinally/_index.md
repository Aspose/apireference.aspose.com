---
title: "System::DoTryFinally metode"
linktitle: "DoTryFinally"
second_title: "Aspose.Page untuk C++"
description: "System::DoTryFinally metode. Fungsi tunggal yang meniru perilaku pernyataan try[-catch]-finally C#''s. Selama penerjemahan pernyataan try[-catch]-finally C#''s dengan opsi translator''s finally_statement_as_lambda disetel ke true, pernyataan tersebut diterjemahkan menjadi pemanggilan metode ini dalam C++."
type: docs
weight: 16500
url: /id/cpp/system/dotryfinally/
---
## System::DoTryFinally(T\&&, F\&&) method


Fungsi tunggal yang meniru perilaku pernyataan try[-catch]-finally C#'s. Selama penerjemahan pernyataan try[-catch]-finally C#'s dengan opsi translator's finally_statement_as_lambda disetel ke true, pernyataan tersebut diterjemahkan menjadi pemanggilan metode ini.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_void<T>::value> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe objek fungsi yang mengimplementasikan bagian try[-catch] dari pernyataan try[-catch]-finally yang sedang ditiru |
| F | Tipe objek fungsi yang mengimplementasikan bagian finally dari pernyataan try[-catch]-finally yang sedang ditiru |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| tryBlock | T\&& | Objek fungsi yang tubuhnya berisi implementasi bagian try[-catch] dari pernyataan try[-catch]-finally yang sedang ditiru |
| finallyBlock | F\&& | Objek fungsi yang tubuhnya berisi implementasi bagian finally dari pernyataan try[-catch]-finally yang sedang ditiru |

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


Fungsi tunggal yang meniru perilaku pernyataan try[-catch]-finally C#'s. Selama penerjemahan pernyataan try[-catch]-finally C#'s dengan opsi translator's finally_statement_as_lambda disetel ke true, pernyataan tersebut diterjemahkan menjadi pemanggilan metode ini. Overload ini menangani kasus di mana nilai kembali dari objek fungsi yang mengimplementasikan bagian try[-catch] dari pernyataan try[-catch]-finally adalah bool.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_boolref<T>::value, bool> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe objek fungsi yang mengimplementasikan bagian try[-catch] dari pernyataan try[-catch]-finally yang sedang ditiru |
| F | Tipe objek fungsi yang mengimplementasikan bagian finally dari pernyataan try[-catch]-finally yang sedang ditiru |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| tryBlock | T\&& | Objek fungsi yang tubuhnya berisi implementasi bagian try[-catch] dari pernyataan try[-catch]-finally yang sedang ditiru |
| finallyBlock | F\&& | Objek fungsi yang tubuhnya berisi implementasi bagian finally dari pernyataan try[-catch]-finally yang sedang ditiru |

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


Fungsi tunggal yang meniru perilaku pernyataan try[-catch]-finally C#. Selama penerjemahan pernyataan try[-catch]-finally C# dengan opsi translator finally_statement_as_lambda diatur ke true, pernyataan tersebut diterjemahkan menjadi pemanggilan metode ini. Overload ini menangani kasus di mana nilai kembali dari objek fungsi yang mengimplementasikan bagian try[-catch] dari pernyataan try[-catch]-finally adalah bool&.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_nonovoid_boolref<T>::value, std::optional<Details::ResultOf<T, bool &>>> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe objek fungsi yang mengimplementasikan bagian try[-catch] dari pernyataan try[-catch]-finally yang sedang ditiru |
| F | Tipe objek fungsi yang mengimplementasikan bagian finally dari pernyataan try[-catch]-finally yang sedang ditiru |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| tryBlock | T\&& | Objek fungsi yang tubuhnya berisi implementasi bagian try[-catch] dari pernyataan try[-catch]-finally yang sedang ditiru |
| finallyBlock | F\&& | Objek fungsi yang tubuhnya berisi implementasi bagian finally dari pernyataan try[-catch]-finally yang sedang ditiru |

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
