---
title: "Перечисление System::Net::WebExceptionStatus"
linktitle: "WebExceptionStatus"
second_title: "Aspose.Page для C++"
description: "Перечисление System::Net::WebExceptionStatus. Перечисляет коды состояния класса WebException в C++."
type: docs
weight: 4900
url: /ru/cpp/system.net/webexceptionstatus/
---
## WebExceptionStatus enum


Перечисляет коды состояния класса [WebException](../webexception/).

```cpp
enum class WebExceptionStatus
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| Success | 0 | Ошибок не возникло. |
| NameResolutionFailure | 1 | Служба разрешения имён не смогла разрешить имя хоста. |
| ConnectFailure | 2 | Не удалось связаться с удалённой точкой сервиса на транспортном уровне. |
| ReceiveFailure | 3 | Полный ответ не получен от удалённого сервера. |
| SendFailure | 4 | Не удалось отправить полный запрос на удалённый сервер. |
| PipelineFailure | 5 | Запрос был конвейерным, и соединение было закрыто до получения ответа. |
| RequestCanceled | 6 | Запрос был отменён или произошла неклассифицируемая ошибка. |
| ProtocolError | 7 | Ответ, полученный от сервера, был полным, но указывал на ошибку уровня протокола. |
| ConnectionClosed | 8 | Соединение было преждевременно закрыто. |
| TrustFailure | 9 | Сертификат сервера не удалось проверить. |
| SecureChannelFailure | 10 | Произошла ошибка при установке соединения с использованием SSL. |
| ServerProtocolViolation | 11 | Ответ сервера не является корректным HTTP-ответом. |
| KeepAliveFailure | 12 | Соединение для запроса, указывающего заголовок 'Keep-Alive', было неожиданно закрыто. |
| Ожидание | 13 | Внутренний асинхронный запрос находится в ожидании. |
| Тайм-аут | 14 | Ответ не был получен в течение периода тайм-аута для запроса. |
| ProxyNameResolutionFailure | 15 | Службе разрешения имён не удалось разрешить имя хоста прокси. |
| UnknownError | 16 | Произошло исключение неизвестного типа. |
| MessageLengthLimitExceeded | 17 | Получено сообщение, превышающее указанный лимит. |
| CacheEntryNotFound | 18 | Указанная запись кэша не найдена. |
| RequestProhibitedByCachePolicy | 19 | Запрос не был разрешён политикой кэша. |
| RequestProhibitedByProxy | 20 | Этот запрос не был разрешён прокси. |

## См. также

* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
