---
title: "System::Net::Cache‑namnområde"
linktitle: "System::Net::Cache"
second_title: "Aspose.Page för C++"
description: "Hur man använder System::Net::Cache‑namnområdet i C++."
type: docs
weight: 4300
url: /sv/cpp/system.net.cache/
---



## Klasser

| Klass | Beskrivning |
| --- | --- |
| [HttpRequestCachePolicy](./httprequestcachepolicy/) | HTTP-cachepolicy som uttrycker RFC2616 HTTP-cachningssemantik. Objekt av denna klass bör endast allokeras med hjälp av funktionen [System::MakeObject()](../system/makeobject/). Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kommer att resultera i körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument. |
| [RequestCachePolicy](./requestcachepolicy/) | Vanlig begäran-cachepolicy som används för cachning av [Http](../system.net.http/), FTP osv. Objekt av denna klass bör endast allokeras med hjälp av funktionen [System::MakeObject()](../system/makeobject/). Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kommer att leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../system/smartptr/) pekare och använd pekaren för att skicka den till funktioner som argument. |
## Enums

| Enum | Beskrivning |
| --- | --- |
| [HttpCacheAgeControl](./httpcacheagecontrol/) | CacheAgeControl används för att ange preferenser med avseende på cachade objekts ålder och färskhet. |
| [HttpRequestCacheLevel](./httprequestcachelevel/) | Enumet beskriver cacheinställningar för HTTP. |
| [RequestCacheLevel](./requestcachelevel/) | Enumet beskriver cacheinställningar som gäller för alla [WebRequest](../system.net/webrequest/). |
