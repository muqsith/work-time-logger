-- create schema
CREATE TABLE IF NOT EXISTS worklog (id text PRIMARY KEY, dayid text, event text, logtime text) WITHOUT ROWID;
CREATE TABLE IF NOT EXISTS days (id text PRIMARY KEY, logdate text) WITHOUT ROWID;
CREATE TABLE IF NOT EXISTS settings (id text PRIMARY KEY, name text, value text, desc text);