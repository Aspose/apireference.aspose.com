---
title: "System::String::Split yöntemi"
linktitle: "Split"
second_title: "Aspose.Font için C++"
description: "System::String::Split yöntemi. Dizeyi C++'da karaktere göre böler."
type: docs
weight: 4300
url: /tr/cpp/system/string/split/
---
## String::Split(char_t, int32_t, StringSplitOptions) const method


Dizgeyi karaktere göre böler.

```cpp
ArrayPtr<String> System::String::Split(char_t separator, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ayırıcı | char_t | Dizeyi bölecek karakter. |
| count | int32_t | Döndürülecek azami alt dize sayısı. |
| opt | StringSplitOptions | Bölme seçenekleri. |

### ReturnValue

[Array](../../array/) of substrings.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(char_t, StringSplitOptions) const method


Dizgeyi karaktere göre böler.

```cpp
ArrayPtr<String> System::String::Split(char_t separator=u' ', StringSplitOptions opt=StringSplitOptions::None) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ayırıcı | char_t | Dizeyi bölecek karakter. |
| opt | StringSplitOptions | Bölme seçenekleri. |

### ReturnValue

[Array](../../array/) of substrings.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(char_t, char_t, StringSplitOptions) const method


Dizgeyi iki karakterden birine göre böler.

```cpp
ArrayPtr<String> System::String::Split(char_t separatorA, char_t separatorB, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| separatorA | char_t | Dizeyi bölecek ilk karakter. |
| separatorB | char_t | Dizeyi bölecek ikinci karakter. |
| opt | StringSplitOptions | Bölme seçenekleri. |

### ReturnValue

[Array](../../array/) of substrings.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const method


Dizgeyi belirtilen karakterlerden birine göre böler.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) ayırıcı karakterlerin listesi. Boş ise, herhangi bir boşluk karakteri ayırıcı olarak kabul edilir. |
| count | int32_t | Döndürülecek azami alt dize sayısı. |
| opt | StringSplitOptions | Bölme seçenekleri. |

### ReturnValue

[Array](../../array/) of substrings.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, StringSplitOptions) const method


Dizgeyi belirtilen karakterlerden birine göre böler.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) ayırıcı karakterlerin listesi. Boş ise, herhangi bir boşluk karakteri ayırıcı olarak kabul edilir. |
| opt | StringSplitOptions | Bölme seçenekleri. |

### ReturnValue

[Array](../../array/) of substrings.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, int, StringSplitOptions) const method


Dizeyi alt dizeye göre böler. Şu anda yalnızca sıfır veya bir öğeden oluşan ayırıcılar dizisini destekler.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) ayırıcı dizelerin listesi. Boş ise, bölme işlemi yapılmaz. |
| count | int | Bölünmüş dizi içindeki azami eleman sayısı. |
| opt | StringSplitOptions | Bölme seçenekleri. |

### ReturnValue

[Array](../../array/) of substrings.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, StringSplitOptions) const method


Dizeyi alt dizeye göre böler.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) ayırıcı dizelerin listesi. Boş ise, bölme işlemi yapılmaz. |
| opt | StringSplitOptions | Bölme seçenekleri. |

### ReturnValue

[Array](../../array/) of substrings.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(const String\&, int, StringSplitOptions) const method


Dizeyi alt dizeye göre böler.

```cpp
ArrayPtr<String> System::String::Split(const String &separator, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ayırıcı | const String\& | Ayırıcı olarak işlev gören alt dize. Boş ise, boşluk karakteri ayırıcı olarak davranır. |
| count | int | Bölünmüş dizi içindeki azami eleman sayısı. |
| opt | StringSplitOptions | Bölme seçenekleri. |

### ReturnValue

[Array](../../array/) of substrings.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(const String\&, StringSplitOptions) const method


Dizeyi alt dizeye göre böler.

```cpp
ArrayPtr<String> System::String::Split(const String &separator, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ayırıcı | const String\& | Ayırıcı olarak işlev gören alt dize. Boş ise, boşluk karakteri ayırıcı olarak davranır. |
| opt | StringSplitOptions | Bölme seçenekleri. |

### ReturnValue

[Array](../../array/) of substrings.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
