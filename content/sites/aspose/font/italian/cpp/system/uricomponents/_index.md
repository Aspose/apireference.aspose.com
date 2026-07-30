---
title: "System::UriComponents enum"
linktitle: "UriComponents"
second_title: "Aspose.Font per C++"
description: "System::UriComponents enum. Rappresenta i componenti URI in C++."
type: docs
weight: 8900
url: /it/cpp/system/uricomponents/
---
## UriComponents enum


Rappresenta i componenti dell'URI.

```cpp
enum class UriComponents
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| Schema | 1 | I dati Scheme. |
| UserInfo | 2 | I dati UserInfo. |
| Host | 4 | I dati Host. |
| Porta | 8 | I dati Port. |
| SchemeAndServer | n/a | I dati Scheme, Host e Port. |
| Percorso | 16 | I dati LocalPath. |
| Query | 32 | I dati Query. |
| PathAndQuery | n/a | I dati LocalPath e Query. |
| HttpRequestUrl | n/a | I dati Scheme, Host, Port, Query e LocalPath. |
| Fragment | 64 | I dati Fragment. |
| AbsoluteUri | n/a | I dati Scheme, Host, Port, Quer, LocalPath e Fragment. |
| StrongPort | 128 | I dati Port; se i dati della porta non sono presenti nel [Uri](../uri/) e una porta predefinita è stata assegnata allo Scheme, viene restituita la porta predefinita; se non esiste una porta predefinita, viene restituito -1. |
| HostAndPort | n/a | I dati Host e Port; se i dati della porta non sono presenti nell'[Uri](../uri/) e una porta predefinita è stata assegnata allo Scheme, viene restituita la porta predefinita. Se non esiste una porta predefinita, viene restituito -1. |
| StrongAuthority | n/a | I dati UserInfo, Host e Port. Se i dati della porta non sono presenti nell'[Uri](../uri/) e una porta predefinita è stata assegnata allo Scheme, viene restituita la porta predefinita. Se non esiste una porta predefinita, viene restituito -1. |
| NormalizedHost | 256 |  |
| KeepDelimiter | 1073741824 | Specifica che il delimitatore deve essere incluso. |
| SerializationInfoString | n/a | Il contesto completo dell'[Uri](../uri/) necessario per i Serializzatori dell'[Uri](../uri/). Il contesto include lo scope IPv6. |

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
