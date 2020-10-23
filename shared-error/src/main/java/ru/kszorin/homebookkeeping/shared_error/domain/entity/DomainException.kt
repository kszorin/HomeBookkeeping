package ru.kszorin.homebookkeeping.shared_error.domain.entity

class DomainException(val code: ErrorCode) : Throwable()