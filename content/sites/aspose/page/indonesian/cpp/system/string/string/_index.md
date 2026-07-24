---
title: "Konstruktor System::String::String"
linktitle: "String"
second_title: "Aspose.Page untuk C++"
description: "Konstruktor System::String::String. Konstruktor default. Membuat objek string yang dianggap null dalam C++."
type: docs
weight: 100
url: /id/cpp/system/string/string/
---
## String::String() constructor


Konstruktor default. Membuat objek string yang dianggap null.

```cpp
System::String::String()
```

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(codeporting_icu::UnicodeString\&&) constructor


Konstruktor pemindahan.

```cpp
System::String::String(codeporting_icu::UnicodeString &&str) noexcept
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| str | codeporting_icu::UnicodeString\&& | UnicodeString untuk dibungkus menjadi [String](../). |

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const ArrayPtr\<char16_t\>\&) constructor


Mengonversi seluruh array karakter menjadi string.

```cpp
System::String::String(const ArrayPtr<char16_t> &arr)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arr | const ArrayPtr\<char16_t\>\& | [Array](../../array/) untuk mengonversi menjadi string. |

## Lihat Juga

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const ArrayPtr\<char16_t\>\&, int, int) constructor


Mengonversi subrentang array karakter menjadi string. Jika parameter berada di luar batas array, string kosong akan dibuat.

```cpp
System::String::String(const ArrayPtr<char16_t> &arr, int offset, int len)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arr | const ArrayPtr\<char16_t\>\& | Array karakter. |
| offset | int | Indeks mulai subarray. |
| len | int | Panjang subarray. |

## Lihat Juga

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char *, int) constructor


Membuat string dari pointer string karakter dan panjang eksplisit.

```cpp
System::String::String(const char *str, int length)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| str | const char * | [String](../) pointer ke data UTF8, mungkin literal atau array. |
| length | int | Panjang string eksplisit |

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char16_t *, int) constructor


Membuat string dari pointer string karakter dan panjang eksplisit.

```cpp
System::String::String(const char16_t *str, int length)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| str | const char16_t * | [String](../) pointer, mungkin literal atau array. |
| length | int | Panjang string eksplisit |

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char16_t *, int, int) constructor


Membuat string dari pointer string karakter mulai dari posisi awal menggunakan panjang.

```cpp
System::String::String(const char16_t *str, int start, int length)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| str | const char16_t * | [String](../) pointer, mungkin literal atau array. |
| mulai | int | Posisi awal. |
| length | int | [String](../) panjang. |

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char16_t, int) constructor


Konstruktor pengisian.

```cpp
System::String::String(const char16_t ch, int count)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ch | const char16_t | Karakter pengisi. |
| count | int | Panjang target. |

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const codeporting_icu::UnicodeString\&) constructor


Membungkus UnicodeString ke dalam [String](../).

```cpp
System::String::String(const codeporting_icu::UnicodeString &str)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| str | const codeporting_icu::UnicodeString\& | UnicodeString untuk dibungkus menjadi [String](../). |

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::string\&) constructor


Membuat [String](../) dari string std::string yang disajikan dalam format UTF-8.

```cpp
System::String::String(const std::string &utf8str)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| utf8str | const std::string\& | String std::string untuk dikonversi menjadi [String](../). |

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::u16string\&) constructor


Membuat [String](../) dari string utf16.

```cpp
System::String::String(const std::u16string &str)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| str | const std::u16string\& | String Utf16 untuk dikonversi menjadi [String](../). |

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::u32string\&) constructor


Membuat [String](../) dari string std::u32string.

```cpp
System::String::String(const std::u32string &u32str)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| u32str | const std::u32string\& | String std::u32string untuk dikonversi menjadi [String](../). |

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::wstring\&) constructor


Membuat [String](../) dari widestring.

```cpp
System::String::String(const std::wstring &str)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| str | const std::wstring\& | Widestring untuk dikonversi menjadi [String](../). |

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const String\&) constructor


Konstruktor penyalinan.

```cpp
System::String::String(const String &str)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| str | const String\& | [String](../) untuk menyalin. |

## Lihat Juga

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, char\>::value\>::type *) constructor


Membuat string berdasarkan pointer string karakter. Menganggap string yang ditunjuk sebagai string yang diakhiri null dalam UTF8, menghitung panjang string target berdasarkan karakter null.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, char>::value>::type *=nullptr)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const T\& | Pointer string karakter. |

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, char16_t\>::value\>::type *) constructor


Membuat string berdasarkan pointer string karakter. Menganggap string yang ditunjuk sebagai string yang diakhiri null, menghitung panjang string target berdasarkan karakter null.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, char16_t>::value>::type *=nullptr)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const T\& | Pointer string karakter. |

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, wchar_t\>::value\>::type *) constructor


Membuat string berdasarkan pointer string widecharacter. Menganggap string yang ditunjuk sebagai string yang diakhiri null, menghitung panjang string target berdasarkan karakter null. Konversi dari wchar_t memakan waktu pada beberapa platform, sehingga konversi implisit tidak diizinkan.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, wchar_t>::value>::type *=nullptr)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const T\& | Pointer string karakter. |

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<std::is_same\<T, std::nullptr_t\>::value\>::type *) constructor


Konstruktor nullptr. Dideklarasikan sebagai templat untuk menyelesaikan prioritas dengan konstruktor templat lainnya.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<std::is_same<T, std::nullptr_t>::value>::type *=nullptr)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Harus berupa nullptr_t |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const T\& | nullptr |

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const wchar_t *, int) constructor


Membuat string dari pointer string widecharacter dan panjang eksplisit. Konversi dari wchar_t memakan waktu pada beberapa platform, sehingga konversi implisit tidak diizinkan.

```cpp
System::String::String(const wchar_t *str, int length)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| str | const wchar_t * | [String](../) pointer, mungkin literal atau array. |
| length | int | Panjang string eksplisit |

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const wchar_t, int) constructor


Konstruktor pengisian. Konversi dari wchar_t memakan waktu pada beberapa platform, sehingga konversi implisit tidak diizinkan.

```cpp
System::String::String(const wchar_t ch, int count=1)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ch | const wchar_t | Karakter pengisi. |
| count | int | Panjang target. |

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(String\&&) constructor


Konstruktor pemindahan.

```cpp
System::String::String(String &&str) noexcept
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| str | String\&& | [String](../) untuk memindahkan data dari. |

## Lihat Juga

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, char\>::value\>::type *) constructor


Membuat string berdasarkan literal string. Menganggap literal sebagai string yang diakhiri null dalam UTF8, menghitung panjang string target berdasarkan ukuran literal.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, char>::value>::type *=nullptr)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | T\& | [String](../) pointer literal. |

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, char16_t\>::value\>::type *) constructor


Membuat string berdasarkan literal string. Menganggap literal sebagai string yang diakhiri null, menghitung panjang string target berdasarkan ukuran literal.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, char16_t>::value>::type *=nullptr)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | T\& | [String](../) pointer literal. |

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, wchar_t\>::value\>::type *) constructor


Membuat string berdasarkan literal widestring. Menganggap literal sebagai string yang diakhiri null, menghitung panjang string target berdasarkan ukuran literal. Konversi dari wchar_t memakan waktu pada beberapa platform, sehingga konversi implisit tidak diizinkan.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, wchar_t>::value>::type *=nullptr)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | T\& | [String](../) pointer literal. |

## Lihat Juga

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
