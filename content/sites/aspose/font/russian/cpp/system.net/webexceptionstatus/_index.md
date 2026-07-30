---
title: "System::Net::WebExceptionStatus enum"
linktitle: "WebExceptionStatus"
second_title: "Aspose.Font для C++"
description: "System::Net::WebExceptionStatus enum. Перечисляет коды состояний класса WebException в C++."
type: docs
weight: 4900
url: /ru/cpp/system.net/webexceptionstatus/
---
## WebExceptionStatus enum


Перечисляет коды состояний класса [WebException](../webexception/).

```cpp
enum class WebExceptionStatus
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| Success | 0 | Ошибок не произошло. |
| NameResolutionFailure | 1 | Служба разрешения имён не смогла разрешить имя хоста. |
| ConnectFailure | 2 | Удалённый сервисный пункт не удалось связаться на транспортном уровне. |
| ReceiveFailure | 3 | Полный ответ не получен от удалённого сервера. |
| SendFailure | 4 | Полный запрос не удалось отправить на удалённый сервер. |
| PipelineFailure | 5 | Запрос был конвейерным, и соединение было закрыто до получения ответа. |
| RequestCanceled | 6 | Запрос был отменён или произошла неклассифицируемая ошибка. |
| ProtocolError | 7 | Ответ, полученный от сервера, был полным, но указывал на ошибку уровня протокола. |
| ConnectionClosed | 8 | Соединение было преждевременно закрыто. |
| TrustFailure | 9 | Сертификат сервера не удалось проверить. |
| SecureChannelFailure | 10 | Произошла ошибка при установлении соединения с использованием SSL. |
| ServerProtocolViolation | 11 | Ответ сервера не является действительным HTTP-ответом. |
| KeepAliveFailure | 12 | Соединение для запроса, указывающего заголовок 'Keep-Alive', было неожиданно закрыто. |
| Pending | 13 | Внутренний асинхронный запрос находится в ожидании. |
| Timeout | 14 | Ответ не был получен в течение периода тайм-аута для запроса. |
| ProxyNameResolutionFailure | 15 | Служба разрешения имен не смогла определить имя хоста прокси. |
| UnknownError | 16 | Произошло исключение неизвестного типа. |
| MessageLengthLimitExceeded | 17 | Получено сообщение, превышающее установленный предел. |
| CacheEntryNotFound | 18 | Указанный элемент кэша не найден. |
| RequestProhibitedByCachePolicy | 19 | Запрос не был разрешён политикой кэша. |
| RequestProhibitedByProxy | 20 | Этот запрос не был разрешён прокси. |

## См. также

* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
