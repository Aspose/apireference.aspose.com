---
title: "System::Net::Sockets::SocketError enum"
linktitle: "SocketError"
second_title: "Aspose.Page voor C++"
description: "System::Net::Sockets::SocketError enum. Somt de socket-fouttypen op in C++."
type: docs
weight: 1300
url: /nl/cpp/system.net.sockets/socketerror/
---
## SocketError enum


Somt de socketfouttypen op.

```cpp
enum class SocketError
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| Success | 0 | Een socketbewerking is succesvol voltooid. |
| SocketError | -1 | Er is een niet-gespecificeerde socketfout opgetreden. |
| Interrupted | 10004 | Een blokkerende socketaanroep is geannuleerd. |
| AccessDenied | 10013 | Toegang tot een socket is geweigerd. |
| Fault | 10014 | Een ongeldige pointeradres is gedetecteerd. |
| InvalidArgument | 10022 | Er is een ongeldig argument opgegeven. |
| TooManyOpenSockets | 10024 | Er zijn te veel geopende sockets in de onderliggende socketprovider. |
| WouldBlock | 10035 | Een bewerking kan niet onmiddellijk worden voltooid op een niet-blokkerende socket. |
| InProgress | 10036 | Er is een blokkerende bewerking aan de gang. |
| AlreadyInProgress | 10037 | Een niet-blokkerende socket heeft al een lopende bewerking. |
| NotSocket | 10038 | Een poging om een socketbewerking aan te roepen op een niet-socket. |
| DestinationAddressRequired | 10039 | Een vereist adres is weggelaten bij een socketbewerking. |
| MessageSize | 10040 | Een datagram is te lang. |
| ProtocolType | 10041 | Een protocoltype wordt niet ondersteund door deze socket. |
| ProtocolOption | 10042 | Er wordt een onbekende, ongeldige of niet-ondersteunde optie of niveau gebruikt. |
| ProtocolNotSupported | 10043 | Een protocol is niet geïmplementeerd of niet geconfigureerd. |
| SocketNotSupported | 10044 | Een adresfamilie ondersteunt de opgegeven socket niet. |
| OperationNotSupported | 10045 | Een protocolfamilie ondersteunt geen adresfamilie. |
| ProtocolFamilyNotSupported | 10046 | Een protocolfamilie is niet geïmplementeerd of niet geconfigureerd. |
| AddressFamilyNotSupported | 10047 | De opgegeven adresfamilie wordt niet ondersteund. |
| AddressAlreadyInUse | 10048 | Een adres kan slechts één keer worden gebruikt. |
| AddressNotAvailable | 10049 | Het geselecteerde IP-adres is niet geldig in deze context. |
| NetworkDown | 10050 | Het netwerk is niet beschikbaar. |
| NetworkUnreachable | 10051 | Er bestaat geen route naar de externe host. |
| NetworkReset | 10052 | Een applicatie probeerde 'Keep-Alive' in te stellen op een verbinding die al is verlopen. |
| ConnectionAborted | 10053 | Een verbinding wordt afgebroken. |
| ConnectionReset | 10054 | Een verbinding wordt gereset door een externe peer. |
| NoBufferSpaceAvailable | 10055 | Er is geen vrije bufferruimte beschikbaar voor een socketbewerking. |
| IsConnected | 10056 | Een socket is al verbonden. |
| NotConnected | 10057 | Een applicatie probeerde gegevens te verzenden of ontvangen, en een socket is niet verbonden. |
| Shutdown | 10058 | Een verzoek om gegevens te verzenden of ontvangen is verboden omdat de socket al is gesloten. |
| TimedOut | 10060 | Een verbindingspoging is verlopen, of een verbonden host heeft niet gereageerd. |
| ConnectionRefused | 10061 | Een externe host weigert actief een verbinding. |
| HostDown | 10064 | Een bewerking is mislukt omdat een externe host niet beschikbaar is. |
| HostUnreachable | 10065 | Er bestaat geen netwerkroute naar de opgegeven host. |
| ProcessLimit | 10067 | Er zijn te veel processen die de onderliggende socketprovider gebruiken. |
| SystemNotReady | 10091 | Een netwerksubysteem is niet beschikbaar. |
| VersionNotSupported | 10092 | Een versie van de onderliggende socketprovider valt buiten het bereik. |
| NotInitialized | 10093 | De onderliggende socketprovider is niet geïnitialiseerd. |
| Disconnecting | 10101 | Er is een gecontroleerde afsluiting bezig. |
| TypeNotFound | 10109 | De opgegeven klasse is niet gevonden. |
| HostNotFound | 11001 | De opgegeven host is onbekend. |
| Opnieuw proberen | 11002 | Een hostnaam kan niet worden opgelost. |
| GeenHerstel | 11003 | Een fout is niet herstelbaar of de gevraagde database kan niet worden gevonden. |
| GeenData | 11004 | Een gevraagde naam of IP-adres is niet gevonden op de naamserver. |

## Zie ook

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
