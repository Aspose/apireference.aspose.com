---
title: "System::Text::StringBuilder::Insert metode"
linktitle: "Sisipkan"
second_title: "Aspose.Page untuk C++"
description: "System::Text::StringBuilder::Insert metode. Menyisipkan karakter ke posisi tetap builder''s dalam C++."
type: docs
weight: 1200
url: /id/cpp/system.text/stringbuilder/insert/
---
## StringBuilder::Insert(int, const System::ArrayPtr\<char_t\>\&, int, int) method


Menyisipkan karakter ke posisi tetap builder.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int index, const System::ArrayPtr<char_t> &chars, int startIndex, int charCount)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi untuk menyisipkan karakter. |
| chars | const System::ArrayPtr\<char_t\>\& | [Array](../../../system/array/) untuk menyisipkan irisan dari. |
| startIndex | int | [Array](../../../system/array/) indeks awal irisan. |
| charCount | int | [Array](../../../system/array/) panjang irisan. |

### ReturnValue

Penunjuk ini.

## Lihat Juga

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int, char_t) method


Menyisipkan karakter ke posisi tetap builder.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, char_t ch)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| startIndex | int | Posisi untuk menyisipkan karakter. |
| ch | char_t | Karakter untuk disisipkan. |

### ReturnValue

Penunjuk ini.

## Lihat Juga

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int, const String\&) method


Menyisipkan string ke posisi tetap builder.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, const String &str)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| startIndex | int | Posisi untuk menyisipkan karakter. |
| str | const String\& | [String](../../../system/string/) untuk disisipkan. |

### ReturnValue

Penunjuk ini.

## Lihat Juga

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int, T) method


Menyisipkan nilai ke posisi tetap builder.

```cpp
template<typename T> std::enable_if<std::is_arithmetic<T>::value, StringBuilder *>::type System::Text::StringBuilder::Insert(int startIndex, T value)
```


| Parameter | Deskripsi |
| --- | --- |
| Parameter | tipe. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| startIndex | int | Posisi untuk menyisipkan karakter. |
| value | T | Nilai untuk memformat dan disisipkan. |

### ReturnValue

Penunjuk ini.

## Lihat Juga

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int32_t, const String\&, int32_t) method


Menyisipkan string berulang ke posisi tetap builder.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int32_t index, const String &value, int32_t count)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int32_t | Posisi untuk menyisipkan karakter. |
| value | const String\& | [String](../../../system/string/) untuk disisipkan. |
| count | int32_t | Berapa kali mengulang string **value**. |

### ReturnValue

Penunjuk ini.

## Lihat Juga

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
