---
title: "System::Net::Sockets::TcpClient::BeginConnect μέθοδος"
linktitle: "BeginConnect"
second_title: "Aspose.Page για C++"
description: "System::Net::Sockets::TcpClient::BeginConnect μέθοδος. Εκκινεί μια ασύγχρονη λειτουργία σύνδεσης σε C++."
type: docs
weight: 300
url: /el/cpp/system.net.sockets/tcpclient/beginconnect/
---
## TcpClient::BeginConnect(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


Ξεκινά μια ασύγχρονη λειτουργία σύνδεσης.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpClient::BeginConnect(String host, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| host | String | Ένα όνομα απομακρυσμένου κεντρικού υπολογιστή. |
| θύρα | int32_t | Μια θύρα του απομακρυσμένου κεντρικού υπολογιστή. |
| requestCallback | AsyncCallback | Ένα callback που θα κληθεί όταν ολοκληρωθεί η λειτουργία. |
| state | System::SharedPtr\<Object\> | Δεδομένα που παρέχονται από τον χρήστη και χρησιμοποιούνται για την μοναδική ταυτοποίηση κάθε ασύγχρονης λειτουργίας σύνδεσης. |

### ReturnValue

Ένα [IAsyncResult](../../../system/iasyncresult/) αντικείμενο που αντιπροσωπεύει τη διεξαχθείσα ασύγχρονη λειτουργία σύνδεσης.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## TcpClient::BeginConnect(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


Ξεκινά μια ασύγχρονη λειτουργία σύνδεσης.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpClient::BeginConnect(System::ArrayPtr<System::SharedPtr<IPAddress>> addresses, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| addresses | System::ArrayPtr\<System::SharedPtr\<IPAddress\>\> | Οι διευθύνσεις IP ενός απομακρυσμένου κεντρικού υπολογιστή. |
| θύρα | int32_t | Μια θύρα του απομακρυσμένου κεντρικού υπολογιστή. |
| requestCallback | AsyncCallback | Ένα callback που θα κληθεί όταν ολοκληρωθεί η λειτουργία. |
| state | System::SharedPtr\<Object\> | Δεδομένα που παρέχονται από τον χρήστη και χρησιμοποιούνται για την μοναδική ταυτοποίηση κάθε ασύγχρονης λειτουργίας σύνδεσης. |

### ReturnValue

Ένα [IAsyncResult](../../../system/iasyncresult/) αντικείμενο που αντιπροσωπεύει τη διεξαχθείσα ασύγχρονη λειτουργία σύνδεσης.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## TcpClient::BeginConnect(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


Ξεκινά μια ασύγχρονη λειτουργία σύνδεσης.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpClient::BeginConnect(System::SharedPtr<IPAddress> address, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| διεύθυνση | System::SharedPtr\<IPAddress\> | Η διεύθυνση IP ενός απομακρυσμένου κεντρικού υπολογιστή. |
| θύρα | int32_t | Μια θύρα του απομακρυσμένου κεντρικού υπολογιστή. |
| requestCallback | AsyncCallback | Ένα callback που θα κληθεί όταν ολοκληρωθεί η λειτουργία. |
| state | System::SharedPtr\<Object\> | Δεδομένα που παρέχονται από τον χρήστη και χρησιμοποιούνται για την μοναδική ταυτοποίηση κάθε ασύγχρονης λειτουργίας σύνδεσης. |

### ReturnValue

Ένα [IAsyncResult](../../../system/iasyncresult/) αντικείμενο που αντιπροσωπεύει τη διεξαχθείσα ασύγχρονη λειτουργία σύνδεσης.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
