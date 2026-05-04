import { jsonClient, formClient } from "./api.service";

export default class foodService {
  constructor(baseUrl = "/api/foods") {
    this.api = jsonClient(baseUrl);
    this.formApi = formClient(baseUrl);
  }

  // [GET] http://localhost:8080/api/foods/
  async getAll() {
    return (await this.api.get("/")).data;
  }

  // [POST] http://localhost:8080/api/foods/
  async create(data) {
    return (
      await this.formApi.post(`/`, data, {
        headers: { "Content-Type": "multipart/form-data" },
      })
    ).data;
  }

  // [PUT] http://localhost:8080/api/foods/
  async update(data) {
    return (
      await this.formApi.put(`/`, data, {
        headers: { "Content-Type": "multipart/form-data" },
      })
    ).data;
  }

  // [DELETE] http://localhost:8080/api/foods/
  async delete(id) {
    return (await this.api.delete(`/${id}`)).data;
  }
}
