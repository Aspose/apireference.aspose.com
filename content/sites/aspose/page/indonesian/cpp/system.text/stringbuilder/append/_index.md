---
title: "System::Text::StringBuilder::Append metode"
linktitle: "Tambahkan"
second_title: "Aspose.Page untuk C++"
description: "System::Text::StringBuilder::Append metode. Menambahkan karakter ke builder dalam C++."
type: docs
weight: 300
url: /id/cpp/system.text/stringbuilder/append/
---
## StringBuilder::Append(char_t) method


Menambahkan karakter ke builder.

```cpp
StringBuilder * System::Text::StringBuilder::Append(char_t c)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| c | char_t | Nilai karakter. |

### ReturnValue

Penunjuk ini.

## Lihat Juga

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(char_t, int) method


Menambahkan karakter ke builder.

```cpp
StringBuilder * System::Text::StringBuilder::Append(char_t c, int count)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| c | char_t | Nilai karakter. |
| count | int | Berapa kali mengulang karakter yang disisipkan. |

### ReturnValue

Penunjuk ini.

## Lihat Juga

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const ArrayPtr\<char_t\>\&) method


Menambahkan array karakter ke builder.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const ArrayPtr<char_t> &arr)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arr | const ArrayPtr\<char_t\>\& | Karakter untuk ditambahkan. |

### ReturnValue

Penunjuk ini.

## Lihat Juga

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const ArrayPtr\<char_t\>\&, int, int) method


Menambahkan potongan array karakter ke builder.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const ArrayPtr<char_t> &arr, int startIndex, int charCount)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arr | const ArrayPtr\<char_t\>\& | Karakter untuk ditambahkan. |
| startIndex | int | Indeks awal slice. |
| charCount | int | Panjang irisan. |

### ReturnValue

Penunjuk ini.

## Lihat Juga

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const SharedPtr\<StringBuilder\>\&) method


Menambahkan konten builder ke builder.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const SharedPtr<StringBuilder> &builder)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| builder | const SharedPtr\<StringBuilder\>\& | Builder untuk menambahkan konten dari. |

### ReturnValue

Penunjuk ini.

## Lihat Juga

* Class [StringBuilder](../)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const SharedPtr\<T\>\&) method


Menambahkan representasi string objek ke builder.

```cpp
template<class T> StringBuilder * System::Text::StringBuilder::Append(const SharedPtr<T> &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | [Object](../../../system/object/) tipe. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const SharedPtr\<T\>\& | [Object](../../../system/object/) untuk diserialkan dan ditambahkan. |

### ReturnValue

Penunjuk ini.

## Lihat Juga

* Class [StringBuilder](../)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const String\&) method


Menambahkan string ke builder.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const String &str)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| str | const String\& | [String](../../../system/string/) untuk ditambahkan. |

### ReturnValue

Penunjuk ini.

## Lihat Juga

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const String\&, int, int) method


Menambahkan potongan string ke builder.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const String &str, int startIndex, int charCount)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| str | const String\& | [String](../../../system/string/) untuk ditambahkan. |
| startIndex | int | Indeks awal slice. |
| charCount | int | Panjang irisan. |

### ReturnValue

Penunjuk ini.

## Lihat Juga

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(double) method


Menambahkan nilai floating point ke builder.

```cpp
StringBuilder * System::Text::StringBuilder::Append(double df)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| df | double | Nilai untuk diserialkan dan ditambahkan. |

### ReturnValue

Penunjuk ini.

## Lihat Juga

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(E) method


Menambahkan representasi string nilai enum ke builder.

```cpp
template<class E> std::enable_if<std::is_enum<E>::value, StringBuilder *>::type System::Text::StringBuilder::Append(E e)
```


| Parameter | Deskripsi |
| --- | --- |
| E | [Enum](../../../system/enum/) tipe. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| e | E | Nilai untuk diserialkan dan ditambahkan. |

### ReturnValue

Penunjuk ini.

## Lihat Juga

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(float) method


Menambahkan nilai floating point ke builder.

```cpp
StringBuilder * System::Text::StringBuilder::Append(float f)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| f | float | Nilai untuk diserialkan dan ditambahkan. |

### ReturnValue

Penunjuk ini.

## Lihat Juga

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(int) method


Menambahkan nilai integer ke builder.

```cpp
StringBuilder * System::Text::StringBuilder::Append(int i)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| i | int | Nilai untuk diserialkan dan ditambahkan. |

### ReturnValue

Penunjuk ini.

## Lihat Juga

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(T) method


Menambahkan nilai aritmetika ke builder.

```cpp
template<typename T> std::enable_if<std::is_arithmetic<T>::value, StringBuilder *>::type System::Text::StringBuilder::Append(T value)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe aritmetika. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | T | Nilai untuk diserialkan dan ditambahkan. |

### ReturnValue

Penunjuk ini.

## Lihat Juga

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
