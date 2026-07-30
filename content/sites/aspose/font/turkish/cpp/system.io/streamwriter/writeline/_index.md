---
title: "System::IO::StreamWriter::WriteLine method"
linktitle: "WriteLine"
second_title: "Aspose.Font için C++"
description: "System::IO::StreamWriter::WriteLine yöntemi. C++'ta akışa satır sonlandırıcı karakterleri yazar."
type: docs
weight: 1100
url: /tr/cpp/system.io/streamwriter/writeline/
---
## StreamWriter::WriteLine() method


Satır sonlandırıcı karakterlerini akışa yazar.

```cpp
void System::IO::StreamWriter::WriteLine() override
```

## Ayrıca Bakınız

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::WriteLine(const ArrayPtr\<char_t\>\&) method


Belirtilen diziden tüm karakterleri, satır sonlandırma karakterleriyle birlikte akışa yazar.

```cpp
void System::IO::StreamWriter::WriteLine(const ArrayPtr<char_t> &buffer) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const ArrayPtr\<char_t\>\& | Yazılacak karakterleri içeren dizi |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::WriteLine(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


Belirtilen karakter dizisinden belirtilen UTF-16 karakter alt aralığını, satır sonlandırma karakterleriyle birlikte akışa yazar.

```cpp
void System::IO::StreamWriter::WriteLine(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const ArrayPtr\<char_t\>\& | Yazılacak karakterleri içeren dizi |
| indeks | int32_t | Yazılacak alt aralığın başladığı **buffer** içindeki 0 tabanlı indeks |
| count | int32_t | Yazılacak alt aralıktaki karakter sayısı; -1, alt aralığın **buffer** dizisinin bittiği yerde sona erdiğini belirtir |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::WriteLine(const char_t *) method


Belirtilen C dizesini, satır sonlandırma karakterleriyle birlikte akışa yazar.

```cpp
void System::IO::StreamWriter::WriteLine(const char_t *buffer) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const char_t * | Yazılacak c-string |

## Ayrıca Bakınız

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::WriteLine(const SharedPtr\<Object\>\&) method


Belirtilen nesnenin dize temsilini ve ardından satır sonlandırıcı karakterlerini akışa yazar.

```cpp
void System::IO::StreamWriter::WriteLine(const SharedPtr<Object> &obj) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const SharedPtr\<Object\>\& | Yazılacak nesne |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::WriteLine(const String\&) method


Belirtilen dizeyi ve ardından satır sonlandırıcı karakterlerini akışa yazar.

```cpp
void System::IO::StreamWriter::WriteLine(const String &value) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | const String\& | Yazılacak dize |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::WriteLine(const System::SharedPtr\<T\>\&) method


Belirtilen nesnenin dize temsilini ve ardından satır sonlandırıcı karakterlerini akışa yazar.

```cpp
template<typename T> void System::IO::StreamWriter::WriteLine(const System::SharedPtr<T> &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Nesnenin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const System::SharedPtr\<T\>\& | Yazılacak nesne |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
