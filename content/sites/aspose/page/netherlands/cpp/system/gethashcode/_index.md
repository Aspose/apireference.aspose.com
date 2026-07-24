---
title: "System::GetHashCode-methode"
linktitle: "VerkrijgHashCode"
second_title: "Aspose.Page voor C++"
description: "System::GetHashCode-methode. Specialisatie voor std::thread::id; Retourneert de hashcode voor het opgegeven thread‑object in C++."
type: docs
weight: 21200
url: /nl/cpp/system/gethashcode/
---
## System::GetHashCode(const std::thread::id\&) method


Specialisatie voor std::thread::id; Retourneert de hashcode voor het opgegeven thread‑object.

```cpp
int System::GetHashCode(const std::thread::id &id)
```

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


Retourneert een hashcode voor de opgegeven scalare waarde.

```cpp
template<typename T> std::enable_if<std::is_scalar<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van de waarde waarvoor de functie een hashcode genereert |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const T\& | De waarde waarvoor een hashcode wordt gegenereerd |

### ReturnValue

De gegenereerde hashcode voor de opgegeven waarde

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


Retourneert een hashcode voor het opgegeven object.

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&System::IsSmartPtr<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van het object waarvoor de functie een hashcode genereert |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const T\& | De [SmartPtr](../smartptr/) die naar het object wijst waarvoor een hashcode wordt gegenereerd |

### ReturnValue

De gegenereerde hashcode voor het opgegeven object

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


Retourneert een hashcode voor het opgegeven object dat een exception is.

```cpp
template<typename T> std::enable_if<System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van het object waarvoor de functie een hashcode genereert |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const T\& | De [Exception](../exception/)-wrapper die het object bevat waarvoor een hashcode wordt gegenereerd |

### ReturnValue

De gegenereerde hashcode voor het opgegeven object

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


Retourneert een hashcode voor het opgegeven object dat geen smart pointer of exception is.

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&!System::IsSmartPtr<T>::value &&!System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van het object waarvoor de functie een hashcode genereert |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const T\& | Een const‑referentie naar het object waarvoor een hashcode wordt gegenereerd |

### ReturnValue

De gegenereerde hashcode voor het opgegeven object

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
