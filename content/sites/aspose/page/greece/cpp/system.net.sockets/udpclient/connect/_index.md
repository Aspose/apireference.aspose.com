---
title: "System::Net::Sockets::UdpClient::Connect method"
linktitle: "Connect"
second_title: "Aspose.Page για C++"
description: "System::Net::Sockets::UdpClient::Connect method. Δημιουργεί μια σύνδεση στη συγκεκριμένη θύρα στον καθορισμένο κεντρικό υπολογιστή σε C++."
type: docs
weight: 300
url: /el/cpp/system.net.sockets/udpclient/connect/
---
## UdpClient::Connect(String, int32_t) method


Καθιερώνει σύνδεση στη συγκεκριμένη θύρα του καθορισμένου κεντρικού υπολογιστή.

```cpp
void System::Net::Sockets::UdpClient::Connect(String hostname, int32_t port)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα κεντρικού υπολογιστή | String | Το όνομα του απομακρυσμένου DNS κεντρικού υπολογιστή στον οποίο σκοπεύετε να συνδεθείτε. |
| θύρα | int32_t | Ο τοπικός αριθμός θύρας από τον οποίο σκοπεύετε να επικοινωνήσετε. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPAddress\>, int32_t) method


Καθιερώνει σύνδεση με τον κεντρικό υπολογιστή στη συγκεκριμένη διεύθυνση στη συγκεκριμένη θύρα.

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPAddress> addr, int32_t port)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| addr | System::SharedPtr\<IPAddress\> | Η [IPAddress](../../../system.net/ipaddress/) του απομακρυσμένου κεντρικού υπολογιστή στον οποίο θα σταλεί δεδομένα. |
| θύρα | int32_t | Ο τοπικός αριθμός θύρας από τον οποίο σκοπεύετε να επικοινωνήσετε. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPEndPoint\>) method


Καθιερώνει σύνδεση σε απομακρυσμένο άκρο.

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPEndPoint> endPoint)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| endPoint | System::SharedPtr\<IPEndPoint\> | το σημείο άκρης στο οποίο δεσμεύετε τη σύνδεση UDP. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
