---
title: "Μέθοδος System::Net::Sockets::UdpClient::Send"
linktitle: "Αποστολή"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Net::Sockets::UdpClient::Send. Στέλνει ένα UDP datagram σε απομακρυσμένο κεντρικό υπολογιστή σε C++."
type: docs
weight: 700
url: /el/cpp/system.net.sockets/udpclient/send/
---
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t) method


Στέλνει ένα UDP datagram σε απομακρυσμένο κεντρικό υπολογιστή.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | Ένας πίνακας τύπου [Byte](../../../system/byte/) για αποστολή. |
| bytes | int32_t | Ο αριθμός των bytes στο datagram. |

### ReturnValue

Ο αριθμός των bytes που αποστέλλονται.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) method


Στέλνει ένα UDP datagram στη συγκεκριμένη θύρα του καθορισμένου απομακρυσμένου κεντρικού υπολογιστή.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, String hostname, int32_t port)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | Ένας πίνακας τύπου [Byte](../../../system/byte/) για αποστολή |
| bytes | int32_t | Ο αριθμός των bytes στο datagram. |
| όνομα κεντρικού υπολογιστή | String | Ένα όνομα του απομακρυσμένου κεντρικού υπολογιστή. |
| θύρα | int32_t | Ένας απομακρυσμένος αριθμός θύρας. |

### ReturnValue

Ο αριθμός των bytes που αποστέλλονται.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) method


Στέλνει ένα UDP datagram στον κεντρικό υπολογιστή στο απομακρυσμένο άκρο.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, System::SharedPtr<IPEndPoint> endPoint)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | Ένας πίνακας τύπου [Byte](../../../system/byte/) για αποστολή |
| bytes | int32_t | Ο αριθμός των bytes στο datagram. |
| endPoint | System::SharedPtr\<IPEndPoint\> | Ένα [IPEndPoint](../../../system.net/ipendpoint/) που αντιπροσωπεύει τον κεντρικό υπολογιστή και τη θύρα στην οποία θα σταλεί το datagram. |

### ReturnValue

Ο αριθμός των bytes που αποστέλλονται.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
